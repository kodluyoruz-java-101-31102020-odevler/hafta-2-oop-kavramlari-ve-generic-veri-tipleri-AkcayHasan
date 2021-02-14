package com.java.Soru4.Account;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.java.Soru4.Insurance.Insurance;

public abstract class Account implements Comparable<Account>{
	
	private User user;
    private final AuthenticationStatus success = AuthenticationStatus.SUCCESS;
    private final AuthenticationStatus fail = AuthenticationStatus.FAIL;
    private AuthenticationStatus login = fail;
    private List<Insurance> userInsurance;

    public Account(User user, AuthenticationStatus login, List<Insurance> userInsurance) {
        this.user = user;
        this.login = login;
        this.userInsurance = userInsurance;
    }

    public Account(){

    }



    public final void showUserInfo() {
        if (this.user != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[ ");
            stringBuilder.append("İsim: ");
            stringBuilder.append(this.user.getName());
            stringBuilder.append(", Soyisim: ");
            stringBuilder.append(this.user.getLastname());
            stringBuilder.append(", Son giriş tarihi: ");
            stringBuilder.append(this.user.getLastDate());
            System.out.println(stringBuilder.toString());
        }else{
            System.out.println("Kullanıcı yok!");
        }
    }

    public void isInvalid() throws InvalidAuthenticationException {
        System.out.println("Email ve Şifrenizi Giriniz..");
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String sifre = scan.nextLine();
        if (email.equals(user.getEmail()) && sifre.equals(user.getPassword())) {
            @SuppressWarnings("unused")
			AuthenticationStatus login = success;
            user.setLastDate(new Date());
            System.out.println("Giriş Başarılı.");
        } else {
            throw new InvalidAuthenticationException("Hatalı Giriş Yaptınız! Tekrar Deneyiniz.");
        }
    }

    public void addAddress() {

    }

    public void removeAddress() {

    }

    public int isLogin() {
        return login.compareTo(fail);
    }

    public abstract void addInsurancePolicy();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user)
                && success == account.success
                && fail == account.fail
                && login == account.login
                && Objects.equals(userInsurance, account.userInsurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, success, fail, login, userInsurance);
    }


}
