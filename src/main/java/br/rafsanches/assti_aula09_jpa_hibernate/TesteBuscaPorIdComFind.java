package br.rafsanches.assti_aula09_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println("\n" + v + "\n");
		manager.close();
		JPAUtil.close();
	}

}
