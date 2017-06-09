package com.safeCar.Service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.safeCar.Bean.InsureRecord;
import com.safeCar.Dao.impl.CashBackDaoImpl;
import com.safeCar.Service.ICashBackService;
import com.safeCar.tools.DateUtils;

public class CashBackServiceImpl implements ICashBackService{
	private String insure_account;
	public CashBackServiceImpl(String insure_account){
		this.insure_account =insure_account;
	}
	
	
	private static int flag_year ;
	@Override
	public Object[] getCashBackInfo() {
		CashBackDaoImpl backDaoImpl = new CashBackDaoImpl();
		System.out.println(insure_account);
		List<InsureRecord>insureRecordList = backDaoImpl.getInsureRecord(insure_account);
		System.out.println(insureRecordList);
		int size = insureRecordList.size();
		InsureRecord  insureRecord = insureRecordList.get(size-1);
		Date insure_lastest_date = insureRecord.getData_insure();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	     String date_insure = sdf.format(insure_lastest_date);  //��ȡ���һ�����ݵ�����
	     int count_ret = insureRecord.getRet_count();
	     System.out.println("date_insure:"+date_insure+"count_ret:"+count_ret);//��ӡ�����ںʹ����Ƿ���ȷ
		return new Object[]{date_insure,count_ret};
	}
	@Override
	public int getRetCount() {
		String time_now = DateUtils.getCurrentTime();//��ȡ��ǰ������
		Object[] obj =getCashBackInfo();
		String insure_date = (String) obj[0];//��ȡͶ������
		int count_ret =(int) obj[1];//��ȡ���ִ���
		String[] arr = insure_date.split("-");
		int years = Integer.parseInt(arr[0]);//��ȡͶ����ǰ���
		int month =Integer.parseInt(arr[1]);//��ȡͶ����ǰ��
		System.out.println(insure_date);
		int date_parse = DateUtils.getTwoDayInterval(time_now, insure_date, true);//2�����ڼ������
		System.out.println(date_parse);
		//�ж��ǲ�������
		 if (years % 4 == 0 && years % 100!=0||years%400==0) flag_year=0;else flag_year = 1;
		 //���������
		 if(flag_year==0){
			 switch(month){
			 //��1�ꡣ{31,29,31,30,31,30,31,30,31,30,31,30   31,28,31,30,31,30,31,30,31,30,31,30}
			 case 1:
				 if(date_parse>=31&&date_parse<60&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=60&&date_parse<91&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=91&&date_parse<121&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=121&&date_parse<152&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=152&&date_parse<182&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=182&&date_parse<213&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=213&&date_parse<243&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=243&&date_parse<274&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=274&&date_parse<304&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=304&&date_parse<335&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=335&&date_parse<365&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=365&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 2:
				 if(date_parse>=29&&date_parse<60&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=60&&date_parse<90&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=90&&date_parse<121&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=121&&date_parse<151&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=152&&date_parse<183&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=183&&date_parse<213&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=213&&date_parse<244&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=244&&date_parse<274&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=274&&date_parse<305&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=305&&date_parse<335&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=335&&date_parse<366&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=366&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 3:
				 if(date_parse>=31&&date_parse<61&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=61&&date_parse<92&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=92&&date_parse<122&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=122&&date_parse<153&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=153&&date_parse<183&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=183&&date_parse<214&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=214&&date_parse<244&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=244&&date_parse<275&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=275&&date_parse<305&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=305&&date_parse<336&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=336&&date_parse<365&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=365&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 4:
				 if(date_parse>=30&&date_parse<61&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=61&&date_parse<91&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=91&&date_parse<122&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=122&&date_parse<152&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=152&&date_parse<183&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=183&&date_parse<213&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=213&&date_parse<243&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=243&&date_parse<274&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=274&&date_parse<304&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=304&&date_parse<335&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=335&&date_parse<365&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=365&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
					break;
			 	case 5:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=153&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<214&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						if(date_parse>=214&&date_parse<244&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=244&&date_parse<275&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						//������4��
						if(date_parse>=275&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<335&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=335&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
				 break;
			 	case 6:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<152&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=152&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<213&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						if(date_parse>=213&&date_parse<244&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						//������5��
						if(date_parse>=244&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
			 		break;
			 	case 7:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=153&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<214&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						//������6��
						if(date_parse>=214&&date_parse<243&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=243&&date_parse<274&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=274&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<335&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=335&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
			 		break;
			 	case 8:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<152&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=152&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						//������7��
						if(date_parse>=183&&date_parse<212&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=212&&date_parse<243&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=243&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 9:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						//������8��
						if(date_parse>=153&&date_parse<182&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=182&&date_parse<213&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=213&&date_parse<243&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=243&&date_parse<274&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=274&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<335&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=335&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 10:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}//������9��
						if(date_parse>=122&&date_parse<151&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=151&&date_parse<182&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=181&&date_parse<212&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=212&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 11:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						//������10��
						if(date_parse>=92&&date_parse<121&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=121&&date_parse<152&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=152&&date_parse<182&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=182&&date_parse<213&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=213&&date_parse<243&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=243&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<365&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 12:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}//������11��
						if(date_parse>=61&&date_parse<90&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						
						if(date_parse>=90&&date_parse<121&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=121&&date_parse<151&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=151&&date_parse<182&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=182&&date_parse<212&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=212&&date_parse<243&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=243&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<304&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=304&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<365&&count_ret!=11){
							 return 11;
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						}
						if(date_parse>=365&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
			 }
		 }else if(flag_year==1){
			 //�����ƽ�꣬2��Ϊ28��
			 switch(month){
			 //��1�ꡣ{31,28,31,30,31,30,31,30,31,30,31,30   31,29,31,30,31,30,31,30,31,30,31,30}
			 case 1:
				 if(date_parse>=31&&date_parse<59&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=59&&date_parse<90&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=90&&date_parse<120&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=120&&date_parse<151&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=151&&date_parse<181&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=181&&date_parse<212&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=212&&date_parse<242&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=242&&date_parse<273&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=273&&date_parse<303&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=303&&date_parse<334&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=334&&date_parse<364&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=364&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 2:
				 if(date_parse>=28&&date_parse<59&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=59&&date_parse<89&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=89&&date_parse<120&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=120&&date_parse<150&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=150&&date_parse<181&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=181&&date_parse<211&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=211&&date_parse<242&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=242&&date_parse<272&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=272&&date_parse<303&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=303&&date_parse<333&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=333&&date_parse<364&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=364&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 3:
				 if(date_parse>=31&&date_parse<61&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=61&&date_parse<92&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=92&&date_parse<122&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=122&&date_parse<153&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=153&&date_parse<183&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=183&&date_parse<214&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=214&&date_parse<244&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=244&&date_parse<275&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=275&&date_parse<305&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=305&&date_parse<336&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=336&&date_parse<364&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=364&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
				 break;
			 case 4:
				 if(date_parse>=30&&date_parse<61&&count_ret!=1){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
					 return 1;
					}
					if(date_parse>=61&&date_parse<91&&count_ret!=2){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
						 return 2;
					}
					if(date_parse>=91&&date_parse<122&&count_ret!=3){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
						 return 3;
					}
					if(date_parse>=122&&date_parse<152&&count_ret!=4){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
						 return 4;
					}
					if(date_parse>=152&&date_parse<183&&count_ret!=5){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
						 return 5;
					}
					if(date_parse>=183&&date_parse<213&&count_ret!=6){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
						 return 6;
					}
					if(date_parse>=213&&date_parse<244&&count_ret!=7){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
						 return 7;
					}
					if(date_parse>=244&&date_parse<274&&count_ret!=8){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
						 return 8;
					}
					if(date_parse>=274&&date_parse<305&&count_ret!=9){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
						 return 9;
					}
					if(date_parse>=305&&date_parse<333&&count_ret!=10){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
						 return 10;
					}
					if(date_parse>=333&&date_parse<364&&count_ret!=11){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						 return 11;
					}
					if(date_parse>=364&&count_ret!=12){
						//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
						 return 12;
					}
					break;
			 	case 5:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=153&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<214&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						if(date_parse>=214&&date_parse<244&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=244&&date_parse<275&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						//������4��
						if(date_parse>=275&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
				 break;
			 	case 6:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<152&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=152&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<213&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						if(date_parse>=213&&date_parse<244&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						//������5��
						if(date_parse>=244&&date_parse<272&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=272&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<333&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=333&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
			 		break;
			 	case 7:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=153&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						if(date_parse>=183&&date_parse<214&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						//������6��
						if(date_parse>=214&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
			 		break;
			 	case 8:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<152&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						if(date_parse>=152&&date_parse<183&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						//������7��
						if(date_parse>=183&&date_parse<211&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=211&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<272&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=272&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<333&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=333&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 9:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=92&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=122&&date_parse<153&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						//������8��
						if(date_parse>=153&&date_parse<181&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=181&&date_parse<212&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=212&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 10:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<91&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						if(date_parse>=91&&date_parse<122&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}//������9��
						if(date_parse>=122&&date_parse<150&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=150&&date_parse<181&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=181&&date_parse<211&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=211&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<272&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=272&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<333&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=333&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 11:
			 		 if(date_parse>=31&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}
						if(date_parse>=61&&date_parse<92&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						//������10��
						if(date_parse>=92&&date_parse<120&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=120&&date_parse<151&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=151&&date_parse<181&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=181&&date_parse<212&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=212&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<273&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=273&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<334&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=334&&date_parse<364&&count_ret!=11){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
							 return 11;
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
				case 12:
			 		 if(date_parse>=30&&date_parse<61&&count_ret!=1){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ1
			 			 return 1;
						}//������11��
						if(date_parse>=61&&date_parse<89&&count_ret!=2){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ2
							 return 2;
						}
						
						if(date_parse>=89&&date_parse<120&&count_ret!=3){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ3
							 return 3;
						}
						if(date_parse>=120&&date_parse<150&&count_ret!=4){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ4
							 return 4;
						}
						
						if(date_parse>=150&&date_parse<181&&count_ret!=5){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ5
							 return 5;
						}
						
						if(date_parse>=181&&date_parse<211&&count_ret!=6){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ6
							 return 6;
						}
						
						if(date_parse>=211&&date_parse<242&&count_ret!=7){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ7
							 return 7;
						}
						if(date_parse>=242&&date_parse<272&&count_ret!=8){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ8
							 return 8;
						}
						if(date_parse>=272&&date_parse<303&&count_ret!=9){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ9
							 return 9;
						}
						if(date_parse>=303&&date_parse<333&&count_ret!=10){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ10
							 return 10;
						}
						if(date_parse>=333&&date_parse<364&&count_ret!=11){
							 return 11;
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ11
						}
						if(date_parse>=364&&count_ret!=12){
							//δ���֣���Ҫ���֣�count_ret��Ҫ��ֵΪ12
							 return 12;
						}
						break;
			 }
		 }
		
		return 0;
	}
	@Override
	public void actCashBack() {
		// TODO Auto-generated method stub
		int count = getRetCount();//��ȡ���ִ���
//		int count = 5;//��ȡ���ִ���,������ģ��ֵ
		CashBackDaoImpl backDaoImpl = new CashBackDaoImpl();
		boolean is ;
		if(count!=0){
			is= backDaoImpl.insertRetCount(count, insure_account);//���·��ִ���
			//�õ����ֵ��ܽ��
			double cashbackTotal = count*(2500/12);
			//�����ֽ����뵽����������
			if(is){
				backDaoImpl.insertRetCash(cashbackTotal, insure_account);
			}
		}
	}

}
