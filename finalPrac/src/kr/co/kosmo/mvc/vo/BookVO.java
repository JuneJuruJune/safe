package kr.co.kosmo.mvc.vo;
/*
 * 
  bno number constraint reservation_semi_rno_pk primary key, --�����ȣ(�ĺ�)
  mid number constraint book_mid_fk references member_semi(mnum), --����ȣ : ���TB�� ����(���1:����N)
  lid number constraint book_lid_fk references local_semi(lno), --�������� : 
  bookcnt number, --�����(���߿� �����ϼ��� �ڵ鸵 ���ɼ�O)
  bstatus varchar2(20), --�ֹ� ����(������/����Ϸ�/������� ���) //
  sdate date, --�Խǳ�¥ // 
  edate date, --��ǳ�¥ // 
  bname  varchar2(30), --�����ڸ� //
  otitle varchar2(30), --���ÿɼ�
  oprice number, -- ����ݾ�
  bdate date default sysdate --������ ������ ��¥

 */
public class BookVO {
	
	private int bno,mid,lid,tcount;
	private String bstatus,sdate,edate,bname,itype,iname,bdate,month;
	
	private LocalVO local;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getTcount() {
		return tcount;
	}

	public void setTcount(int tcount) {
		this.tcount = tcount;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getItype() {
		return itype;
	}

	public void setItype(String itype) {
		this.itype = itype;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public LocalVO getLocal() {
		return local;
	}

	public void setLocal(LocalVO local) {
		this.local = local;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}
	
	
	
	
}
