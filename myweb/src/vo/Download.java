package vo;

public class Download {
           private int id;
           private String name;
           private String path;
           private String description;
           private Long size;
           private int star;
           private String image;
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
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getSize() {
			return size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public int getStar() {
			return star;
		}
		public void setStar(int star) {
			this.star = star;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public Download(int id, String name, String path, String description, Long size, int star, String image) {
			super();
			this.id = id;
			this.name = name;
			this.path = path;
			this.description = description;
			this.size = size;
			this.star = star;
			this.image = image;
		}
           
}
