package models;

public class KhachHang {
        private String name;
        private String ngaySinh;
        private String diaChi;
        private String img;

        public KhachHang() {

        }

        public KhachHang(String name, String ngaySinh, String diaChi, String img) {
            this.name = name;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }
