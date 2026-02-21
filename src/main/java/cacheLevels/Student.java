package cacheLevels;


	
	import javax.persistence.Cacheable;
	import javax.persistence.Entity;
	import javax.persistence.Id;

	import org.hibernate.annotations.Cache;
	import org.hibernate.annotations.CacheConcurrencyStrategy;

	@Entity
	@Cacheable
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	public class Student {

		@Id
		private int id;
		
		private String name;
		
		public Student() {
			
		}
		
		

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		

}
