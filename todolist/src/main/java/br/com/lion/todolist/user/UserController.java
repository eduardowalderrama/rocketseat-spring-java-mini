package br.com.lion.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) Numeros 0.000
     * Float (float) Numeros 0.000
     * char (A C )
     * Date (data)
     * void
     * @param userModel
     */
    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }

}
