package com.bawei.yuekao_yupeng20190731.model.bean;

import java.util.List;

public class RecylaBean {

    /**
     * result : [{"commodityId":172,"commodityName":"艾奔AspenSpor新款大容量男士双肩包学生书包防盗电脑包充电旅行背包 黑色_标准版","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/dnb/3/1.jpg","price":89,"saleNum":0},{"commodityId":188,"commodityName":"赫登尔（herder）双肩包男时尚旅行背包学生书包电脑包大容量潮流男包0902A","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/sjb/5/1.jpg","price":169,"saleNum":0},{"commodityId":118,"commodityName":" 新款 iPad 128G WIFI 版 平板电脑","masterPic":"http://172.17.8.100/images/small/commodity/sjsm/yyyl/5/1.jpg","price":2988,"saleNum":0},{"commodityId":184,"commodityName":"瑞士军刀双肩包男士背包新款大容量休闲商务旅行电脑包学生书包 USb充电包","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/sjb/1/1.jpg","price":99,"saleNum":0},{"commodityId":174,"commodityName":"帆布派 Canvas artisan 苹果笔记本电脑包 女14/15.6寸惠普电脑包联想1 PT38-1酒红色 14寸可用","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/dnb/5/1.jpg","price":229,"saleNum":0},{"commodityId":190,"commodityName":"XDDESIGN 蒙马特城市安全防盗背包 经典版 商务男女款双肩包15英寸笔记本电脑包 ","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/sjb/7/1.jpg","price":369,"saleNum":0},{"commodityId":171,"commodityName":"HOTBOOM2018男士双肩包休闲背包潮流学生书包多功能笔记本商务14英寸电脑包5606 时尚灰","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/dnb/2/1.jpg","price":109,"saleNum":0},{"commodityId":187,"commodityName":"DiDe迪德双肩包男士背包休闲大容量防水复古电脑包多功能时尚学生潮流书包 DQ860","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/sjb/4/1.jpg","price":89,"saleNum":0},{"commodityId":176,"commodityName":"瑞士军刀大容量背包多功能户外出差旅行包双肩包男15.6英寸笔记本电脑包手提斜挎行李包旅游登山包防泼水 黑色【多功能手提斜跨双肩单肩】","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/dnb/7/1.jpg","price":119,"saleNum":0},{"commodityId":173,"commodityName":"新番祖 电脑包 13.3/14/15.6英寸苹果笔记本电脑包 女 手提公文包 贝壳 樱花粉-13.3英寸及以下（淑女款）","masterPic":"http://172.17.8.100/images/small/commodity/xbsd/dnb/4/1.jpg","price":119,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 172
         * commodityName : 艾奔AspenSpor新款大容量男士双肩包学生书包防盗电脑包充电旅行背包 黑色_标准版
         * masterPic : http://172.17.8.100/images/small/commodity/xbsd/dnb/3/1.jpg
         * price : 89
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
