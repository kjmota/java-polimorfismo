
public class SomandoMedia  {

	    private float numero1;
	    private float numero2;
	    private float numero3;
	    private float maiorNumero;
	    private float menorNumero;
	    private float media;

		protected void setNumero1(float a) {
			this.numero1 = 1;
			
		}

		protected void setNumero2(float b) {
			this.numero2 = 2;
			
		}

		protected void setNumero3(float c) {
			 this.numero3 = 3;
			
		}

	    public float getMedia() {

	        this.media = (this.numero1 + this.numero2 + this.numero3)/3;

	        return this.media;
	    }

	    public float encontraMaiorNumero() {

	        if (this.numero1 > this.numero2) {
	            if (this.numero1 > this.numero3) {
	                this.maiorNumero = this.numero1;
	            }
	        } else if (this.numero2 > this.numero3) {
	            if (this.numero2 > this.numero1) {
	                this.maiorNumero = this.numero2;
	            }
	        } else if (this.numero3 > this.numero1) {
	            if (this.numero3 > this.numero2) {
	                this.maiorNumero = this.numero3;
	            }
	        }

	        return this.maiorNumero;

	    }

	    public float encontraMenorNumero() {
	        if (this.numero1 < this.numero2) {
	            if (this.numero1 < this.numero3) {
	                this.menorNumero = this.numero1;
	            }
	        } else if (this.numero2 < this.numero3) {
	            if (this.numero2 < this.numero1) {
	                this.menorNumero = this.numero2;
	            }
	        } else if (this.numero3 < this.numero1) {
	            if (this.numero3 < this.numero2) {
	                this.menorNumero = this.numero3;
	            }
	        }

	        return this.menorNumero;
	    }
}
