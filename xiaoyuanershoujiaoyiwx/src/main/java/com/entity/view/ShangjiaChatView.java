package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangjiaChatEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 用户咨询
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangjia_chat")
public class ShangjiaChatView extends ShangjiaChatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 状态的值
	*/
	@ColumnInfo(comment="状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;
	/**
	* 数据类型的值
	*/
	@ColumnInfo(comment="数据类型的字典表值",type="varchar(200)")
	private String shangjiaChatValue;

	//级联表 商家
		/**
		* 商家名称
		*/

		@ColumnInfo(comment="商家名称",type="varchar(200)")
		private String shangjiaName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String shangjiaPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String shangjiaEmail;
		/**
		* 营业执照展示
		*/

		@ColumnInfo(comment="营业执照展示",type="varchar(200)")
		private String shangjiaPhoto;
		/**
		* 商家类型
		*/
		@ColumnInfo(comment="商家类型",type="int(11)")
		private Integer shangjiaTypes;
			/**
			* 商家类型的值
			*/
			@ColumnInfo(comment="商家类型的字典表值",type="varchar(200)")
			private String shangjiaValue;
		/**
		* 现有余额
		*/
		@ColumnInfo(comment="现有余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 商家介绍
		*/

		@ColumnInfo(comment="商家介绍",type="longtext")
		private String shangjiaContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer shangjiaDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/



	public ShangjiaChatView() {

	}

	public ShangjiaChatView(ShangjiaChatEntity shangjiaChatEntity) {
		try {
			BeanUtils.copyProperties(this, shangjiaChatEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 数据类型的值
	*/
	public String getShangjiaChatValue() {
		return shangjiaChatValue;
	}
	/**
	* 设置： 数据类型的值
	*/
	public void setShangjiaChatValue(String shangjiaChatValue) {
		this.shangjiaChatValue = shangjiaChatValue;
	}


	//级联表的get和set 商家

		/**
		* 获取： 商家名称
		*/
		public String getShangjiaName() {
			return shangjiaName;
		}
		/**
		* 设置： 商家名称
		*/
		public void setShangjiaName(String shangjiaName) {
			this.shangjiaName = shangjiaName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getShangjiaPhone() {
			return shangjiaPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setShangjiaPhone(String shangjiaPhone) {
			this.shangjiaPhone = shangjiaPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getShangjiaEmail() {
			return shangjiaEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setShangjiaEmail(String shangjiaEmail) {
			this.shangjiaEmail = shangjiaEmail;
		}

		/**
		* 获取： 营业执照展示
		*/
		public String getShangjiaPhoto() {
			return shangjiaPhoto;
		}
		/**
		* 设置： 营业执照展示
		*/
		public void setShangjiaPhoto(String shangjiaPhoto) {
			this.shangjiaPhoto = shangjiaPhoto;
		}
		/**
		* 获取： 商家类型
		*/
		public Integer getShangjiaTypes() {
			return shangjiaTypes;
		}
		/**
		* 设置： 商家类型
		*/
		public void setShangjiaTypes(Integer shangjiaTypes) {
			this.shangjiaTypes = shangjiaTypes;
		}


			/**
			* 获取： 商家类型的值
			*/
			public String getShangjiaValue() {
				return shangjiaValue;
			}
			/**
			* 设置： 商家类型的值
			*/
			public void setShangjiaValue(String shangjiaValue) {
				this.shangjiaValue = shangjiaValue;
			}

		/**
		* 获取： 现有余额
		*/

		/**
		* 获取： 商家介绍
		*/
		public String getShangjiaContent() {
			return shangjiaContent;
		}
		/**
		* 设置： 商家介绍
		*/
		public void setShangjiaContent(String shangjiaContent) {
			this.shangjiaContent = shangjiaContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getShangjiaDelete() {
			return shangjiaDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShangjiaDelete(Integer shangjiaDelete) {
			this.shangjiaDelete = shangjiaDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}


	@Override
	public String toString() {
		return "ShangjiaChatView{" +
			", zhuangtaiValue=" + zhuangtaiValue +
			", shangjiaChatValue=" + shangjiaChatValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", shangjiaName=" + shangjiaName +
			", shangjiaPhone=" + shangjiaPhone +
			", shangjiaEmail=" + shangjiaEmail +
			", shangjiaPhoto=" + shangjiaPhoto +
			", newMoney=" + newMoney +
			", shangjiaContent=" + shangjiaContent +
			", shangjiaDelete=" + shangjiaDelete +
			"} " + super.toString();
	}
}
