package kongkin.bbu.edu.webapi.models.request;



public class TokenRefreshRequest {

  private String refreshToken;

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
