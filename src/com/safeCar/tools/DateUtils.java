package com.safeCar.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtils extends Date{
	 private static String ymdhms = "yyyy-MM-dd HH:mm:ss";    
     private static String ymd = "yyyy-MM-dd";    
     public static SimpleDateFormat ymdSDF = new SimpleDateFormat(ymd);    
     private static String year = "yyyy";    
     private static String month = "MM";    
     private static String day = "dd";    
     public static SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(ymdhms);    
     public static SimpleDateFormat yearSDF = new SimpleDateFormat(year);    
     public static SimpleDateFormat monthSDF = new SimpleDateFormat(month);    
     public static SimpleDateFormat daySDF = new SimpleDateFormat(day);    
     
     public static SimpleDateFormat yyyyMMddHHmm = new SimpleDateFormat(    
             "yyyy-MM-dd HH:mm");    
     
     public static SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");    
     
     public static SimpleDateFormat yyyyMMddHH_NOT_ = new SimpleDateFormat(    
             "yyyyMMdd");    
     
     public static long DATEMM = 86400L;    
     /**  
      * ��õ�ǰʱ��  
      * ��ʽ��2014-12-02 10:38:53  
      * @return String  
      */  
     public static String getCurrentTime() {    
         return yyyyMMddHHmmss.format(new Date());    
     }    
     /**  
      * ���Ի�ȡ���������  
      * ��ʽ��2014-12-01  
      * @return String  
      */  
     public static String getYesterdayYYYYMMDD() {    
         Date date = new Date(System.currentTimeMillis() - DATEMM * 1000L);    
         String str = yyyyMMdd.format(date);    
         try {    
             date = yyyyMMddHHmmss.parse(str + " 00:00:00");    
             return yyyyMMdd.format(date);    
         } catch (ParseException e) {    
             e.printStackTrace();    
         }    
         return "";    
     }    
     /**  
      * ���Ի�ȡ����N�������  
      * ��ʽ������2 �õ�2014-11-30  
      * @param backDay  
      * @return String  
      */  
     public String getStrDate(String backDay) {  
         Calendar calendar = Calendar.getInstance() ;  
         calendar.add(Calendar.DATE, Integer.parseInt("-" + backDay));  
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;  
         String back = sdf.format(calendar.getTime()) ;  
         return back ;  
     }  
     /**  
      *��ȡ��ǰ���ꡢ�¡���  
      * @return String  
      */  
     public static String getCurrentYear() {    
         return yearSDF.format(new Date());    
     }   
     public static String getCurrentMonth() {    
         return monthSDF.format(new Date());    
     }   
     public static String getCurrentDay() {    
         return daySDF.format(new Date());    
     }    
     /**  
      * ��ȡ������ Ҳ���ǵ�ǰʱ��  
      * ��ʽ��2014-12-02  
      * @return String  
      */  
     public static String getCurrentymd() {    
         return ymdSDF.format(new Date());    
     }    
     /**  
      * ��ȡ����0�㿪ʼ������  
      * @return long  
      */  
     public static long getTimeNumberToday() {    
         Date date = new Date();    
         String str = yyyyMMdd.format(date);    
         try {    
             date = yyyyMMdd.parse(str);    
             return date.getTime() / 1000L;    
         } catch (ParseException e) {    
             e.printStackTrace();    
         }    
         return 0L;    
     }    
     /**  
      * ��ȡ���������  
      * ��ʽ��20141202  
      * @return String  
      */  
     public static String getTodateString() {    
         String str = yyyyMMddHH_NOT_.format(new Date());    
         return str;    
     }   
     /**  
      * ��ȡ���������  
      * ��ʽ��20141201  
      * @return String  
      */  
     public static String getYesterdayString() {    
         Date date = new Date(System.currentTimeMillis() - DATEMM * 1000L);    
         String str = yyyyMMddHH_NOT_.format(date);    
         return str;    
     }    
     /**    
      * ����������    
      *     
      * @return Date  
      */    
     public static Date getYesterDayZeroHour() {    
         Calendar cal = Calendar.getInstance();    
         cal.add(Calendar.DATE, -1);    
         cal.set(Calendar.SECOND, 0);    
         cal.set(Calendar.MINUTE, 0);    
         cal.set(Calendar.HOUR, 0);    
         return cal.getTime();    
     }    
     /**    
      * ��long������תString ��---OK    
      *     
      * @param date    
      *            long�����ڣ�    
      * @param format    
      *            ���ڸ�ʽ��    
      * @return    
      */    
     public static String longToString(long date, String format) {    
         SimpleDateFormat sdf = new SimpleDateFormat(format);    
         // ǰ���lSysTime���������ȳ�1000�õ�����������תΪjava.util.Date����    
         java.util.Date dt2 = new Date(date * 1000L);    
         String sDateTime = sdf.format(dt2); // �õ���ȷ����ı�ʾ��08/31/2006 21:08:00    
         return sDateTime;    
     }    
     
     /**    
      * ��ý������    
      *     
      * @return Date  
      */    
     public static Date getTodayZeroHour() {    
         Calendar cal = Calendar.getInstance();    
         cal.set(Calendar.SECOND, 0);    
         cal.set(Calendar.MINUTE, 0);    
         cal.set(Calendar.HOUR, 0);    
         return cal.getTime();    
     }   
     /**    
      * �������23ʱ59��59��    
      *     
      * @return    
      */    
     public static Date getYesterDay24Hour() {    
         Calendar cal = Calendar.getInstance();    
         cal.add(Calendar.DATE, -1);    
         cal.set(Calendar.SECOND, 59);    
         cal.set(Calendar.MINUTE, 59);    
         cal.set(Calendar.HOUR, 23);    
         return cal.getTime();    
     }    
     /**    
      * String To Date ---OK    
      *     
      * @param date    
      *            ��ת�����ַ��������ڣ�    
      * @param format    
      *            ת�������ڸ�ʽ    
      * @return ���ظ��ַ��������������ݣ�    
      */    
     public static Date stringToDate(String date, String format) {    
         SimpleDateFormat sdf = new SimpleDateFormat(format);    
         try {    
             return sdf.parse(date);    
         } catch (ParseException e) {    
             return null;    
         }    
     }    
     
     /**    
      * ���ָ���������ڵ���Ȼ�ܵĵ�һ�죬������    
      *     
      * @param date    
      *            ����    
      * @return ��Ȼ�ܵĵ�һ��    
      */    
     public static Date getStartDayOfWeek(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.set(Calendar.DAY_OF_WEEK, 1);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      * ���ָ���������ڵ���Ȼ�ܵ����һ�죬������    
      *     
      * @param date    
      * @return    
      */    
     public static Date getLastDayOfWeek(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.set(Calendar.DAY_OF_WEEK, 7);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      * ���ָ���������ڵ��µ�һ��    
      *     
      * @param date    
      * @return    
      */    
     public static Date getStartDayOfMonth(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.set(Calendar.DAY_OF_MONTH, 1);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      * ���ָ���������ڵ������һ��    
      *     
      * @param date    
      * @return    
      */    
     public static Date getLastDayOfMonth(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.set(Calendar.DATE, 1);    
         c.add(Calendar.MONTH, 1);    
         c.add(Calendar.DATE, -1);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      * ���ָ�����ڵ���һ���µĵ�һ��    
      *     
      * @param date    
      * @return    
      */    
     public static Date getStartDayOfNextMonth(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.add(Calendar.MONTH, 1);    
         c.set(Calendar.DAY_OF_MONTH, 1);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      * ���ָ�����ڵ���һ���µ����һ��    
      *     
      * @param date    
      * @return    
      */    
     public static Date getLastDayOfNextMonth(Date date) {    
         Calendar c = Calendar.getInstance();    
         c.setTime(date);    
         c.set(Calendar.DATE, 1);    
         c.add(Calendar.MONTH, 2);    
         c.add(Calendar.DATE, -1);    
         date = c.getTime();    
         return date;    
     }    
     
     /**    
      *     
      * ��ĳһ��ʱ����ǰ�������ʱ��(currentTimeToBefer)---OK    
      *     
      * @param givedTime    
      *            ������ʱ��    
      * @param interval    
      *            ���ʱ��ĺ����������㷽ʽ ��n(��)*24(Сʱ)*60(����)*60(��)(����)    
      * @param format_Date_Sign    
      *            ������ڵĸ�ʽ����yyyy-MM-dd��yyyyMMdd�ȣ�    
      */    
     public static String givedTimeToBefer(String givedTime, long interval,    
             String format_Date_Sign) {    
         String tomorrow = null;    
         try {    
             SimpleDateFormat sdf = new SimpleDateFormat(format_Date_Sign);    
             Date gDate = sdf.parse(givedTime);    
             long current = gDate.getTime(); // ��Calendar��ʾ��ʱ��ת���ɺ���    
             long beforeOrAfter = current - interval * 1000L; // ��Calendar��ʾ��ʱ��ת���ɺ���    
             Date date = new Date(beforeOrAfter); // ��timeTwo����������date2    
             tomorrow = new SimpleDateFormat(format_Date_Sign).format(date);    
         } catch (ParseException e) {    
             e.printStackTrace();    
         }    
         return tomorrow;    
     }    
     /**    
      * ��String ����ת����long�����ڣ�---OK    
      *     
      * @param date    
      *            String �����ڣ�    
      * @param format    
      *            ���ڸ�ʽ��    
      * @return    
      */    
     public static long stringToLong(String date, String format) {    
         SimpleDateFormat sdf = new SimpleDateFormat(format);    
         Date dt2 = null;    
         long lTime = 0;    
         try {    
             dt2 = sdf.parse(date);    
             // ����ת���õ�������long��    
             lTime = dt2.getTime() / 1000;    
         } catch (ParseException e) {    
             e.printStackTrace();    
         }    
     
         return lTime;    
     }    
     
     /**    
      * �õ��������ڼ�ļ�����ڣ�    
      *     
      * @param endTime    
      *            ����ʱ��    
      * @param beginTime    
      *            ��ʼʱ��    
      * @param isEndTime    
      *            �Ƿ�����������ڣ�    
      * @return    
      */    
     public static Map<String, String> getTwoDay(String endTime,    
             String beginTime, boolean isEndTime) {    
         Map<String, String> result = new HashMap<String, String>();    
         if ((endTime == null || endTime.equals("") || (beginTime == null || beginTime    
                 .equals(""))))    
             return null;    
         try {    
             java.util.Date date = ymdSDF.parse(endTime);    
             endTime = ymdSDF.format(date);    
             java.util.Date mydate = ymdSDF.parse(beginTime);    
             long day = (date.getTime() - mydate.getTime())    
                     / (24 * 60 * 60 * 1000);    
             result = getDate(endTime, Integer.parseInt(day + ""), isEndTime);    
         } catch (Exception e) {    
         }    
         return result;    
     }    
     
     /**    
      * �õ��������ڼ�ļ�����ڣ�    
      *     
      * @param endTime    
      *            ����ʱ��    
      * @param beginTime    
      *            ��ʼʱ��    
      * @param isEndTime    
      *            �Ƿ�����������ڣ�    
      * @return    
      */    
     public static Integer getTwoDayInterval(String endTime, String beginTime,    
             boolean isEndTime) {    
         if ((endTime == null || endTime.equals("") || (beginTime == null || beginTime    
                 .equals(""))))    
             return 0;    
         long day = 0l;    
         try {    
             java.util.Date date = ymdSDF.parse(endTime);    
             endTime = ymdSDF.format(date);    
             java.util.Date mydate = ymdSDF.parse(beginTime);    
             day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);    
         } catch (Exception e) {    
             return 0 ;    
         }    
         return Integer.parseInt(day + "");    
     }    
     
     /**    
      * ���ݽ���ʱ���Լ������ֵ�������Ҫ������ڼ��ϣ�    
      *     
      * @param endTime    
      * @param interval    
      * @param isEndTime    
      * @return    
      */    
     public static Map<String, String> getDate(String endTime, Integer interval,    
             boolean isEndTime) {    
         Map<String, String> result = new HashMap<String, String>();    
         if (interval == 0 || isEndTime) {    
             if (isEndTime)    
                 result.put(endTime, endTime);    
         }    
         if (interval > 0) {    
             int begin = 0;    
             for (int i = begin; i < interval; i++) {    
                 endTime = givedTimeToBefer(endTime, DATEMM, ymd);    
                 result.put(endTime, endTime);    
             }    
         }    
         return result;    
     }        
	     
}
