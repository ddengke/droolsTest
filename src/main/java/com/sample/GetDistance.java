package com.sample;
public class GetDistance {
    static double DEF_PI = 3.14159265359; // PI
        static double DEF_2PI= 6.28318530712; // 2*PI
        static double DEF_PI180= 0.01745329252; // PI/180.0
        static double DEF_R =6370693.5; // radius of earth
       
        //根据百度坐标测距
        public static double GetDistance(double lon1, double lat1, double lon2, double lat2)
        {
            double ew1, ns1, ew2, ns2;
            double distance;
            // 角度转换为弧度
            ew1 = lon1 * DEF_PI180;
            ns1 = lat1 * DEF_PI180;
            ew2 = lon2 * DEF_PI180;
            ns2 = lat2 * DEF_PI180;
            // 求大圆劣弧与球心所夹的角(弧度)
            distance = Math.sin(ns1) * Math.sin(ns2) + Math.cos(ns1) * Math.cos(ns2) * Math.cos(ew1 - ew2);
            // 调整到[-1..1]范围内，避免溢出
            if (distance > 1.0)
                 distance = 1.0;
            else if (distance < -1.0)
                  distance = -1.0;
            // 求大圆劣弧长度
            distance = DEF_R * Math.acos(distance);
            return distance;
        }
        public static void main(String[] args) {
            double mLat1 = 31.368581442506895; // point1纬度
            double mLon1 = 121.18277495554561; // point1经度
            double mLat2 = 31.20081209996937;// point2纬度
            double mLon2 = 121.44755103551018;// point2经度
            double distance = GetDistance.GetDistance(mLon1, mLat1, mLon2, mLat2);
            System.out.println(distance);
        }
         
}