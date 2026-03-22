package jep511;

public class MainJep511 {

    public void main(String[] args) {
        System.out.println("═══════════════════════════════════════");
        System.out.println("✅Running "+this.getClass().getName());
        System.out.println("═══════════════════════════════════════");
        
        new OldStyle().execute();
        new java25style().execute();
        
        System.out.println("═══════════════════════════════════════");
        System.out.println("✅Done "+this.getClass().getName());
        System.out.println("═══════════════════════════════════════");
    }
}