/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author gumot
 */

import java.io.IOException;

import model.Endereco;
import model.Requisicao;

public class controllerRequisicaoEndereco {

	public Endereco getEndereco(String cep) throws IOException {
                
		Requisicao requisicao = new Requisicao();
		return requisicao.retornaEndereço(cep);

	}
}
