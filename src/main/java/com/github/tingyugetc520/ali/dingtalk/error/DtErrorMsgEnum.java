package com.github.tingyugetc520.ali.dingtalk.error;

import lombok.Getter;

/**
 * 全局错误码.
 * 参考文档：https://ding-doc.dingtalk.com/document/app/server-api-error-codes-1
 */
@Getter
public enum DtErrorMsgEnum {
    /**
     * 系统繁忙；服务器暂不可用，建议稍后再重试1次，最多重试3次
     */
    CODE_1(-1, "系统繁忙；服务器暂不可用，建议稍后再重试1次，最多重试3次。"),
    /**
     * 请求成功；接口调用成功.
     */
    CODE_0(0, "请求成功；接口调用成功"),
    /**
     * 鉴权异常；关注返回结果里的subCode和subMsg
     */
    CODE_88(88, "鉴权异常；关注返回结果里的subCode和subMsg"),
    /**
     * 请求的URI地址不存在；地址不存在，检查下url是否和文档里写的一致
     */
    CODE_404(404, "请求的URI地址不存在；地址不存在，检查下url是否和文档里写的一致"),
    /**
     *
     */
    CODE_33001(33001, "无效的企业ID；请确认access_token是否正确"),
    /**
     *
     */
    CODE_33002(33002, "无效的微应用的名称；校验微应用的名称字段，不能为空且长度不能超过10个字符。"),
    /**
     *
     */
    CODE_33012(33012, "无效的USERID;请检查userid是否正确，可通过获取部门用户userid列表接口获取。"),

    /**
     *
     */
    CODE_40001(40001, "获取access_token时Secret错误，或者access_token无效;检查下access_token是否正确"),
    /**
     *
     */
    CODE_40002(40002, "不合法的凭证类型"),
    /**
     * 无效的UserID.
     */
    CODE_40003(40003, "无效的UserID"),
    /**
     *
     */
    CODE_40004(40004, "不合法的媒体文件类型；检查下type字段，只支持image、voice、file"),
    /**
     *
     */
    CODE_40005(40005, "不合法的文件类型；如果是文件类型，检查下是否是支持。目前只支持doc、docx、xls、xlsx、ppt、pptx、zip、pdf、rar。"),
    /**
     *
     */
    CODE_40006(40006, "不合法的文件大小；检查下文件大小，image类型最大1MB，file类型最大10MB，voice类型最大2MB。"),
    /**
     *
     */
    CODE_40007(40007, "不合法的媒体文件id;检查下mediaId是否为空，是否真实存在。可通过上传媒体文件接口获取。"),
    /**
     *
     */
    CODE_40008(40008, "不合法的消息类型；检查下msgtype是否为空，确保它在开放平台定义的几种类型里，msgtype请参考消息类型与数据格式"),
    /**
     *
     */
    CODE_40009(40009, "不合法的部门id；检查下部门id是否为空，是否为数字且大于0。"),
    /**
     *
     */
    CODE_40010(40010, "不合法的父部门id；检查父部门id是否为一个数字。"),
    /**
     *
     */
    CODE_40011(40011, "不合法的排序order；检查下order字段是否为空，是否为数字且大于0。"),
    /**
     *
     */
    CODE_40013(40013, "不合法的CorpID；需确认CorpID是否填写正确"),
    /**
     * 不合法的access_token.
     */
    CODE_40014(40014, "不合法的access_token"),

    /**
     *
     */
    CODE_40018(40018, "不允许以递归方式查询部门用户列表；检查下fetchChild字段，目前不支持递归查询。"),

    /**
     * 不合法的oauth_code.
     */
    CODE_40029(40029, "不合法的oauth_code"),
    /**
     *
     */
    CODE_40031(40031, "不合法的UserID列表；指定的UserID列表，至少存在一个UserID不在通讯录中"),
    /**
     *
     */
    CODE_40032(40032, "不合法的UserID列表长度;检查下列表是否为空，且长度合适。创建部门接口的userPerimits最多接收10000个。"),
    /**
     * 不合法的请求字符；不能包含\\uxxxx格式的字符.
     */
    CODE_40033(40033, "不合法的请求字符；不能包含\\uxxxx格式的字符"),
    /**
     * 不合法的参数.
     */
    CODE_40035(40035, "不合法的参数"),

    /**
     *
     */
    CODE_40068(40068, "不合法的偏移量；偏移量必须大于0。"),
    /**
     *
     */
    CODE_40069(40069, "不合法的分页大小；分页大小不合法，具体参考每个接口的参数定义。"),
    /**
     *
     */
    CODE_40070(40070, "不合法的排序参数;具体参考获取部门成员接口里面对order字段的定义。"),

    /**
     * 缺少access_token参数.
     */
    CODE_41001(41001, "缺少access_token参数"),
    /**
     * 缺少corpid参数.
     */
    CODE_41002(41002, "缺少corpid参数"),
    /**
     * 缺少secret参数.
     */
    CODE_41004(41004, "缺少secret参数"),
    /**
     *
     */
    CODE_41005(41005, "缺少多媒体文件数据"),
    /**
     *
     */
    CODE_41006(41006, "缺少media_id参数；检查下media_id参数是否为空。"),
    /**
     * 缺少auth code参数.
     */
    CODE_41008(41008, "缺少auth code参数"),
    /**
     * 缺少userid参数.
     */
    CODE_41009(41009, "缺少userid参数"),
    /**
     * 缺少url参数.
     */
    CODE_41010(41010, "缺少url参数"),
    /**
     * 缺少agentid参数.
     */
    CODE_41011(41011, "缺少agentid参数"),

    /**
     *
     */
    CODE_42001(42001, "access_token已过期"),

    /**
     *
     */
    CODE_48002(48002, "Api禁用"),

    /**
     * 应用已停用
     */
    CODE_50003(50003, "应用已停用"),
    /**
     *
     */
    CODE_50005(50005, "企业已禁用"),
    /**
     *
     */
    CODE_52010(52010, "无效的corpid"),
    /**
     *
     */
    CODE_52017(52017, "无效的jsapi列表参数;请检查dd.config中的jsApiList参数是否正确。"),
    /**
     *
     */
    CODE_52018(52018, "无效的时间戳;请检查timestamp参数是否正确。"),
    /**
     *
     */
    CODE_52019(52019, "无效的agentid;请检查agentid参数是否正确。"),

    /**
     *
     */
    CODE_60001(60001, "不合法的部门名称；请检查部门名称是否正确，长度不能超过64个字符。"),
    /**
     *
     */
    CODE_60002(60002, "部门层级深度超过限制"),
    /**
     *
     */
    CODE_60003(60003, "部门不存在"),
    /**
     * 父部门不存在
     */
    CODE_60004(60004, "父部门不存在"),
    /**
     *
     */
    CODE_60005(60005, "不允许删除有成员的部门"),
    /**
     *
     */
    CODE_60006(60006, "不允许删除有子部门的部门"),
    /**
     *
     */
    CODE_60007(60007, "不允许删除根部门"),
    /**
     *
     */
    CODE_60008(60008, "父部门下该部门名称已存在"),
    /**
     *
     */
    CODE_60009(60009, "部门名称含有非法字符"),
    /**
     *
     */
    CODE_60010(60010, "部门存在循环关系"),
    /**
     *
     */
    CODE_60011(60011, "没有调用该接口的权限;需要修改appkey对应的权限点。请上开放平台 > 应用详情页 > 权限管理 > 添加接口权限 > 接口权限勾选对应的权限点"),
    /**
     *
     */
    CODE_60012(60012, "不允许删除默认应用"),

    /**
     *
     */
    CODE_60019(60019, "从部门查询人员失败;请检查该成员是否在该部门中。可通过获取部门用户userid列表接口获取。"),

    /**
     *
     */
    CODE_60102(60102, "UserID在公司中已存在"),
    /**
     * 手机号码不合法
     */
    CODE_60103(60103, "手机号码不合法"),
    /**
     *
     */
    CODE_60104(60104, "手机号码在公司中已存在"),
    /**
     * 邮箱不合法
     */
    CODE_60105(60105, "邮箱不合法"),
    /**
     * 邮箱已存在
     */
    CODE_60106(60106, "邮箱已存在"),
    /**
     *
     */
    CODE_60107(60107, "使用该手机登录钉钉的用户已经在企业中"),
    /**
     *
     */
    CODE_60110(60110, "部门个数超出限制"),
    /**
     *
     */
    CODE_60111(60111, "UserID不存在"),
    /**
     *
     */
    CODE_60112(60112, "成员name不合法"),
    /**
     *
     */
    CODE_70001(70001, "企业不存在或者已经被解散"),

    /**
     *
     */
    CODE_80001(80001, "可信域名没有IPC备案，后续将不能在该域名下正常使用jssdk"),

    /**
     *
     */
    CODE_90001(90001, "您的服务器调用钉钉开放平台所有接口的请求都被暂时禁用了"),
    /**
     *
     */
    CODE_90002(90002, "您的服务器调用钉钉开放平台当前接口的所有请求都被暂时禁用了"),
    /**
     *
     */
    CODE_90003(90003, "您的企业调用钉钉开放平台所有接口的请求都被暂时禁用了，仅对企业自己的Accesstoken有效"),
    /**
     *
     */
    CODE_90004(90004, "您当前使用的CorpId及CorpSecret被暂时禁用了，仅对企业自己的Accesstoken有效"),
    /**
     *
     */
    CODE_90005(90005, "您的企业调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效"),
    /**
     *
     */
    CODE_90006(90006, "您当前使用的CorpId及CorpSecret调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效"),
    /**
     *
     */
    CODE_853003(853003, "accessKey参数不合法，必须是钉钉开放平台存在的appId"),
    ;

    private int code;
    private String msg;

    DtErrorMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 通过错误代码查找其中文含义..
     */
    public static String findMsgByCode(int code) {
        for (DtErrorMsgEnum value : DtErrorMsgEnum.values()) {
            if (value.code == code) {
                return value.msg;
            }
        }

        return null;
    }
}
