public class Matrix {
		private Integer[][] arr;
        private int size;

        public Matrix (int size) {
        	this.size = size;

        	arr = new Integer[size][size]; 

        	for(int i = 0;i< size;i++)
        		for(int j = 0;j < size;j++)
        			arr[i][j] = 1;

        }

        public Matrix (Matrix b) {
        this.size = b.size;
        this.arr = new Integer[size][size];
        for (int i = 0; i < size; i++) 
            for (int j = 0; j < size; j++) 
                this.arr[i][j] = b.arr[i][j];
            
        
    	}

        public Matrix product (Matrix b) {
            if (this.size != b.size) {
                System.out.println("ERROR!");
                return this;
            }
            Matrix res = new Matrix(this.size);
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    res.arr[i][j] = 0;
                    for(int k = 0; k < size; k++){
                        res.arr[i][j] += this.arr[i][k] * b.arr[k][j];
                    }
                }
            }
            return res;
        }

        public Matrix sum (Matrix b) {
            if (this.size != b.size) {
                System.out.println("ERROR!");
                return this;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    this.arr[i][j] += b.arr[i][j];
                }
            }
            return this;
        }

        public int get( int a, int b){
            return this.arr[a][b];

        }

        public void set( int a, int b, int c){
            this.arr[a][b]= c;
            return;

        }

                    public Matrix doMiracle(int a) {
                Matrix tmp = new Matrix(this.size);
                if (a == 1)
                for (int i = 0; i<this.size; i++){
                    for (int j = 0; j<this.size; j++){
                       
                        
                            
                }
            }           
            return tmp;
          }

        public Matrix doMiracleDiag (int a) {
            Matrix tmp = new Matrix(arr.length);
            if (a == 0){
              for (int i =0; i < arr.length; i++){
                for (int j =0; j < arr.length; j++){
                  if (j < i) continue;
                  else if (i == j) tmp.arr[i][j] = this.arr[i][j];
                  else {
                    tmp.arr[j][i] = this.arr[i][j];
                    tmp.arr[i][j] = this.arr[j][i];

                  }
                }
              }
            }
            else if (a == 1){
              for (int i =0; i < arr.length; i++){
                for (int j =0; j < arr.length; j++){
                  if (j > arr.length-i-1) continue;
                  else if ((i+j) == (arr.length-1)) tmp.arr[i][j] = this.arr[i][j];
                  else {
                    tmp.arr[arr.length-1-i][arr.length-1-j] = this.arr[i][j];
                    tmp.arr[i][j] = this.arr[arr.length-1-i][arr.length-1-j];
                  }
                }
              }
            }
            
            return tmp;
  }

        
        public String toString() {
            StringBuilder sb = new StringBuilder(); 
            for (int i = 0; i < size; i++) {
                sb.append("[");
                for (int j = 0; j < size; j++) {
                    sb.append(arr[i][j]);
                    if (j != size - 1) 
                        sb.append("\t");
                }
                sb.append("]");
                if (i != size - 1) 
                    sb.append("\n");
            }
            return sb.toString();
        }


} 