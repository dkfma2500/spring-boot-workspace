class Member {
    String name;

    public Member() {

    }
}

public class UnderstandDI {
    public static void main(String[] args) {
        
    }

    public static void memberUse1 () {
        Member m1 = new Member();

    }
    public static void memberUse2 (Member member) {
        
        Member m2 = member;
    }
}
