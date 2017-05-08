package np.r.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;

import np.r.crypto.AES;
import np.r.fileio.FileProcessor;
import np.r.vo.CipherText;
import np.r.vo.Config;
import np.r.vo.DateTimeUtils;
import np.r.vo.KeyPair;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequestMapping("/v1/a")
public class Uploader {
	
	

	@RequestMapping(value = "/upload1/", method = RequestMethod.POST)
	public String x(@RequestBody KeyPair cc) {

		return "a" + cc.getPrivateKey();
	}

	@RequestMapping(value = "/encrypt/", headers = "content-type=multipart/*", method = RequestMethod.POST,produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public FileSystemResource encrypt(@RequestParam("file") MultipartFile file,HttpServletResponse response) {

		String folder = Config.UPLOADED_FOLDER+ DateTimeUtils.getCurrentDate()+"/";
		 File directory = new File(String.valueOf(folder));
		    if (! directory.exists()){
		        directory.mkdirs();
		    }

		try {

			byte[] bytes = file.getBytes();
			Path path = Paths.get(folder + file.getOriginalFilename());
			System.out.println(path.getFileName());
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("message::" + "You successfully uploaded '"
				+ file.getOriginalFilename() + "'");
		String filenamewithpath = folder+file.getOriginalFilename();
		
		FileProcessor fp = new FileProcessor();
		String x = fp.getFileContent(filenamewithpath);
		System.out.println(x);
		x = new AES().encrypt(new CipherText(Config.ASAKEY, x));
		
		return new FileSystemResource(fp.getFileWithNewContent(filenamewithpath, x));
		
		
	}
	
	
	@RequestMapping(value = "/decrypt/", headers = "content-type=multipart/*", method = RequestMethod.POST,produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public FileSystemResource decrypt(@RequestParam("file") MultipartFile file,HttpServletResponse response) {

		String folder = Config.UPLOADED_FOLDER+ DateTimeUtils.getCurrentDate()+"/";
		 File directory = new File(String.valueOf(folder));
		    if (! directory.exists()){
		        directory.mkdirs();
		    }

		try {

			byte[] bytes = file.getBytes();
			Path path = Paths.get(folder + file.getOriginalFilename());
			System.out.println(path.getFileName());
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("message::" + "You successfully uploaded '"
				+ file.getOriginalFilename() + "'");
		String filenamewithpath = folder+file.getOriginalFilename();
		
		FileProcessor fp = new FileProcessor();
		String x = fp.getFileContent(filenamewithpath);
		System.out.println(x);
		x = new AES().decrypt(new CipherText(Config.ASAKEY, x));
		
		return new FileSystemResource(fp.getFileWithNewContent(filenamewithpath, x));
		
		
	}
	
	
	
	
	
}
