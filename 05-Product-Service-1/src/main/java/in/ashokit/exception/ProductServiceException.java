
package in.ashokit.exception;


public class ProductServiceException extends RuntimeException {

	private String errorCode;

	public ProductServiceException(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
//if any problem occurs in the project then going to throws user defined exception.
//every exception will be some code is available
//created the constructor  with msg and code.
//public ProductServiceException(String msg, String errorCode) {
//super(msg);
//this.errorCode = errorCode;
//} user defind exception