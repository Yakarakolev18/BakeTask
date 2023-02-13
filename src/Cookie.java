public class Cookie {
    private boolean cookieHasChocolateChips;
    private String cookieTexture;

    public Cookie(){
        this.cookieHasChocolateChips = false;
        this.cookieTexture = "fudgy";
    }
    public Cookie(boolean cookieHasChocolateChips, String cookieTexture) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
        this.cookieTexture = cookieTexture;
    }

    public boolean isCookieHasChocolateChips() {
        return cookieHasChocolateChips;
    }

    public void setCookieHasChocolateChips(boolean cookieHasChocolateChips) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
    }

    public String getCookieTexture() {
        return cookieTexture;
    }

    public void setCookieTexture(String cookieTexture) {
        this.cookieTexture = cookieTexture;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "cookieHasChocolateChips=" + cookieHasChocolateChips +
                ", cookieTexture='" + cookieTexture + '\'' +
                '}';
    }
}
