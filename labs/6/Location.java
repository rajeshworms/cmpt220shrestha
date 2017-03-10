
class Location {
        public int row;
        public int column;
        double maxValue;

        //Constructor to set the values of desired fields
        Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }
        
        //To find the location of the largest value
        static Location locateLargest(double[][] a) {
            Location location = new Location(0, 0, a[0][0]);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > location.maxValue)
                        location = new Location(i, j, a[i][j]);
                }
            }
            return location;
        }

        //To display the final data with proper required format
        public String properFormat() {
            String formattedMaxValue;
            if (maxValue % 1.0 != 0)
                formattedMaxValue = String.format("%s", maxValue);
            else
                formattedMaxValue = String.format("%.0f", maxValue);
            return String.format("The location of the largest element is %s at (%d, %d)",
                    formattedMaxValue, row, column);
        }
    }