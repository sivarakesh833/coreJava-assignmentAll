package com.cg.persist;

public class Client {
static Persistence persistence;

	public Client(Persistence persistence) {
	super();
	this.persistence = persistence;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  if(persistence instanceof FilePersistence)
	  persistence.persist();
  else if(persistence instanceof DatabasePersistence)
	  persistence.persist();
	}

}
