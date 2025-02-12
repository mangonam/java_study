package chapter10_access_modifier;
/*
    접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데
        사용되는 명령어
    종류 :
        1) public : 모든 클래스에서 접근 가능 -> setter / getter 자동 생성 때 public으로 만들어진 이유
        2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
            자식 클래스에서 접근 가능(상속 개념은 추후 설명 예정)
        3) default(package-private) : 접근 지정자를 명시하지 않으면
            default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
        4) private : 같은 클래스 내에서만 접근 가능

    작성 가이드 라인
        1. BankAccessModifier
            1) 필드
                accountNumber(계좌번호, 정수)
                accountHolder(예금주 이름, 문자열)
                balance(잔액, 정수)
                pinNumber(비밀번호, 4자리 정수)

            2) 생성자
                기본 생성자
                계좌 번호만 받는 생성자
                계좌 번호와 예금주를 받는 생성자
                계좌 번호, 예금주, 초기 잔액을 받는 생성자
                계좌 번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

            3) 메서드
                Setter / Getter
                    특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                        -> 잔액은 음수일 수 없음
                        -> 비밀번호는 0000 ~ 9999까지만 가능  -> 실패하면 "불가능한 비밀번호입니다."
                입출금 메서드
                    deposit(int amount, int inputPin) -> 입금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 콘솔창에
                            입금 성공! 현재 잔액 : 100000원
                    withdraw(int amount, int inputPin) -> 출금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 출금 후 잔액이 0 이상인지 확인 -> 실패하면 "출금 불가입니다."
                        - 콘솔창에 출금 성공! 현재 잔액 : 40000원
                    showAccountInfo()
                        - 콘솔창에
                            안근수 님의 계좌 번호는 1234567이며, 현재 잔액은 100000원입니다.

        작성 중에 여러분 나름대로 BankAccessModifierMain에 객체 생성해보고 되는지 안되는지 다 검증할 것.
        저는 여러분들이 작성 다 끝나고 나면 객체 이런 방식으로 만들어서 특정 메서드 실행해보세요. -> 그때 통과 되는지 확인할 예정
 */
public class BankAccessModifier {
    private int accountNumber = 1234567;
    private String accountHolder = "이현규";
    private long balance = 0;
    private int pinNumber = 1234;

    public BankAccessModifier() {
    }

    public BankAccessModifier(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccessModifier(int accountNumber, String accountHolder, long balance, int pinNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    private void setBalance(long balance) {
        this.balance = balance;
        if (balance<0) {
            System.out.println("대출이 정지되어 있습니다");
        }
    }

    private void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        if (pinNumber<0 || pinNumber>10000) {
            System.out.println("비밀번호 입력이 잘못되었습니다");
        }
    }

    public void deposit(long amount, int inputPin) {
        if (inputPin!=pinNumber) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            System.out.println("[보안프로세스] 프로그램을 종료합니다");
        }
        if (amount<1) {
            System.out.println("불가능한 금액 입력입니다");
        }
        else if (inputPin==pinNumber) {
            balance = balance+amount;
            System.out.println("입금 완료! 현재 금액:"+balance);
        }
    }
    public void withdraw(long amount, int inputPin) {
        if (inputPin!=pinNumber) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            System.out.println("[보안프로세스] 프로그램을 종료합니다");
        }
        if (amount<1) {
            System.out.println("불가능한 금액 입력입니다");
        }
        if (balance-amount<0) {
            System.out.println("돈이 부족합니다[-마이너스 통장 개설을 추천합니다-]");
        }
        else if (inputPin==pinNumber) {
            balance = balance-amount;
            System.out.println("출금 완료! 현재 금액:"+balance);
        }

    }
    public void showAccountInfo() {
        System.out.println(accountHolder+"님의 계좌 번호는 "+accountNumber+"이며, 현재 금액은 "+balance+"원 입니다");
    }
}