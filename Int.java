class Int{
	
	private int value;
	
	Int() {value = 0;}

	public void increment(){
		value++;
	}
	
	public void decrement(){
		value--;
	}

	public void	add(Int a){
		value+=a.value;
	}
	public void	substract(Int a){
		value-=a.value;
	}

	public String toString(){
		return "" + value;
	}

	public void multiply(int a){
		int number = value;
		for(int i=1; i<a; i++){
			value+=number;
		}
		//value+=number;
	}

	public void power(int a){
		int number = value;
		if(a==0){
				value=1;
				return;}
		for(int i=1; i<a;i++){
		multiply(number);
		}

	}


};

