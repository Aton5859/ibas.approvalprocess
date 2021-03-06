package org.colorcoding.ibas.approvalprocess;

/**
 * 我的配置项
 */
public class MyConfiguration extends org.colorcoding.ibas.bobas.MyConfiguration {

	/**
	 * 模块标识
	 */
	public static final String MODULE_ID = "b3382a56-bdda-412c-bc2f-af17cd19142e";

	/**
	 * 命名空间
	 */
	public static final String NAMESPACE_ROOT = "http://colorcoding.org/ibas/approvalprocess/";

	/**
	 * 数据命名空间
	 */
	public static final String NAMESPACE_DATA = NAMESPACE_ROOT + "data";

	/**
	 * 业务对象命名空间
	 */
	public static final String NAMESPACE_BO = NAMESPACE_ROOT + "bo";

	/**
	 * 服务命名空间
	 */
	public static final String NAMESPACE_SERVICE = NAMESPACE_ROOT + "service";
	/**
	 * 命名空间
	 */
	public static final String NAMESPACE_INITIAL = NAMESPACE_ROOT + "initial";
	/**
	 * 配置项目-文件文件夹
	 */
	public final static String CONFIG_ITEM_APPROVALPROCESS_FILE_FOLDER = "APFileFolder";

}
