package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Bruno Jacob");
//		cliente.setProfissao("DEV");
//		cliente.setCpf("0785465657");
//
//		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oss.writeObject(cliente);
//		oss.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente nome = (Cliente) ois.readObject();
		ois.close();
		System.out.println(nome.getCpf());
	
	}

}
