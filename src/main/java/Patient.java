public record Patient(String name, String mobile){
    public Patient() {
        this("", "");
    }
    public boolean isInitialized(){
        return !this.name.isBlank() && !this.mobile.isBlank();
    }
}
