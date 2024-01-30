public class Pelanggan {
    private String name;
    private String memberType;

    public Pelanggan(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}