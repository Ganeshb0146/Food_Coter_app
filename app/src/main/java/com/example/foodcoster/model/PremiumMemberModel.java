package com.example.foodcoster.model;

import java.util.ArrayList;

public class PremiumMemberModel {

    private String msg;

    private ArrayList<Data> data;

    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class Data
    {
        private ArrayList<Category> category;

        public ArrayList<Category> getCategory() {
            return category;
        }

        public void setCategory(ArrayList<Category> category) {
            this.category = category;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [category = "+category+"]";
        }

        public class Category
        {
            private ArrayList<String> premium_text;

            private String banner_image;

            public ArrayList<String> getPremium_text() {
                return premium_text;
            }

            public void setPremium_text(ArrayList<String> premium_text) {
                this.premium_text = premium_text;
            }

            public String getBanner_image ()
            {
                return banner_image;
            }

            public void setBanner_image (String banner_image)
            {
                this.banner_image = banner_image;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [premium_text = "+premium_text+", banner_image = "+banner_image+"]";
            }
        }




    }


}
