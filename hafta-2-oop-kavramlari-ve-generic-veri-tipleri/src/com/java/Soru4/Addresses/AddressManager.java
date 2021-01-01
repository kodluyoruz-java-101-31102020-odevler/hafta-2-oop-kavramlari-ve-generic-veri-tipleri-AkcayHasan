package com.java.Soru4.Addresses;

import java.util.ArrayList;
import java.util.List;

import com.java.Soru4.Account.User;

public class AddressManager {
	
	public static void add(User user,Address address){
        if (user.getAddressList().size() == 0){
            List<Address> addressList = new ArrayList<>();
            addressList.add(address);
            user.setAddressList(addressList);
        }else{
            System.out.println("Adres zaten Kayıtlı!");
        }
    }

    public static void delete(User user, Address address){
        if (user.getAddressList().size() != 0){
            user.getAddressList().remove(address);
        }else{
            System.out.println("Hatalı işlem!");
        }
    }

}
