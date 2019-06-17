package com.example.demo.entity;

public class Stu {
        private Integer id;
        private Integer stuid;
        private String stuname;
        private String sex;
        private String birthday;
        private String cname;
        private String email;
        private String note;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getStuid() {
            return stuid;
        }

        public void setStuid(Integer stuid) {
            this.stuid = stuid;
        }

        public String getStuname() {
            return stuname;
        }

        public void setStuname(String stuname) {
            this.stuname = stuname;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        @Override
        public String toString() {
            return "StuMapper{" +
                    "id=" + id +
                    ", stuid='" + stuid + '\'' +
                    ", stuname='" + stuname + '\'' +
                    ", sex='" + sex + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", cname='" + cname + '\'' +
                    ", email='" + email + '\'' +
                    ", note='" + note + '\'' +
                    '}';
        }
    }
