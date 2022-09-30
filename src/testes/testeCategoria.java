/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import entidades.Categoria;
import persistencia.CategoriaDAO;

public class testeCategoria {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Senac");
        categoria.setTipo('F');

        categoria.setId(1);
        System.out.println(CategoriaDAO.alterar(categoria));
    }

}
