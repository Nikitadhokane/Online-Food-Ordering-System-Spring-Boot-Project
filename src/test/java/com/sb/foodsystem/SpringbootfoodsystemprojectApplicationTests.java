package com.sb.foodsystem;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sb.foodsystem.dao.CartRepository;
import com.sb.foodsystem.dao.MenuRepository;
import com.sb.foodsystem.dao.UserRepository;
import com.sb.foodsystem.entity.Cart;
import com.sb.foodsystem.entity.Login;
import com.sb.foodsystem.entity.Menu;
import com.sb.foodsystem.entity.User;
import com.sb.foodsystem.serviceimpl.CartServiceImpl;
import com.sb.foodsystem.serviceimpl.MenuServiceImpl;
import com.sb.foodsystem.serviceimpl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootfoodsystemprojectApplicationTests {
	@Autowired
    UserRepository userRepository;

    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    MenuServiceImpl menuServiceImpl;

    @Autowired
    CartServiceImpl cartServiceImpl;

    @Test
    public void contextLoads() {
        Login login = new Login();
        login.setUsername("Ritu");
        login.setPassword("Ritu123");

        User user = userServiceImpl.login("String userName", "String password");
        Assert.assertEquals("Ritu",user.getUserName());
        Assert.assertEquals("ritu@gmail.com",user.getEmail());
        Assert.assertEquals(login, user);
    }

//    @Test
//    public void checkMenuTable(){
//        Menu menu = new Menu();
//        menu.setId(null);
//        Menu menu1 = MenuRepository.findMenuById(1L);
//        Assert.assertEquals("Coffee",menu1.getItem());
//        Assert.assertEquals(50,menu1.getPrice());
//    }
    
//    @Test
//    public void testMenuRetrieval() {
//        Menu menu = MenuRepository.findMenuById(menuId);// Assuming getMenuById method exists
//        Assert.assertEquals("Coffee", menu.getItem());
//        Assert.assertEquals(50, menu.getPrice());
//    }
//
//    @Test
//    public void checkCartDb(){
//        List<Cart> carts = CartRepository. findByCartId(cartId);
//        Cart zero = carts.get(0);
//        Assert.assertEquals(0,zero.getQuantity());
//    }

    /*Test*/


}
