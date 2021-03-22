package features.certification.interfaces.compositions;

public class Security implements Authentication {
    @Override
    public void authenticate() {
        System.out.println("Security authenticate");
    }
}
