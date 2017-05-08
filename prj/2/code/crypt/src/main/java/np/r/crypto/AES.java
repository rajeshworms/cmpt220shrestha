package np.r.crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import np.r.vo.CipherText;
/**
 * Deals with using the AES algorithm to encrypt/decrypt String content.
 * A 16-bit length key is required to perform the encryption.
 * The encrypted text can only be decrypted using the same 16 bit key.
 * Uses the javax crypto library for implementing the encryption.
 * @author r
 *
 */
public class AES {
	
	public String encrypt(CipherText ct) {
		String encryptionKey = ct.getKey();
		String plainText = ct.getText();
		Cipher cipher = null;
		try {
			cipher = getCipher(encryptionKey,Cipher.ENCRYPT_MODE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		byte[] encryptedBytes = null;
		try {
			encryptedBytes = cipher.doFinal(plainText.getBytes());
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		}
		return Base64.encodeBase64String(encryptedBytes);
	}
	
	
	public String decrypt(CipherText ct) {
		String encryptionKey = ct.getKey();
		String encrypted = ct.getText();
		Cipher cipher = null;
		try {
			cipher = getCipher(encryptionKey,Cipher.DECRYPT_MODE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		byte[] plainBytes = null;
		try {
			plainBytes = cipher.doFinal(Base64.decodeBase64(encrypted));
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		}
		return new String(plainBytes);
	}

	
	
	private Cipher getCipher(String encryptionKey, int cipherMode) throws Exception {
		String encryptionAlgorithm = "AES";
		SecretKeySpec keySpecification = new SecretKeySpec(
				encryptionKey.getBytes("UTF-8"), encryptionAlgorithm);
		Cipher cipher = Cipher.getInstance(encryptionAlgorithm);
		cipher.init(cipherMode, keySpecification);
		return cipher;
	}

}
