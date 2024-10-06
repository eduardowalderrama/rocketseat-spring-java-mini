package br.com.lion.todolist.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static void copyNonNullProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }

    // metodo que verifica todos os atributos dentro do objeto e faz uma validacao.
    public static String[] getNullPropertyNames(Object source) {
        // acessando as propriedades do objeto
        final BeanWrapper src = new BeanWrapperImpl(source);

        // obtendo as propriedades do objeto
        PropertyDescriptor[] pds = src.getPropertyDescriptors();
        Set<String> emptyNames = new HashSet<>();

        // adicionando os dados null
        for (PropertyDescriptor pd: pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }

        // obtendo todas as propriedades com valor null
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

}
