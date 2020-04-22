package org.deyi.usercenter.domain.entity.user;

import lombok.*;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class User {
    /**
     * Id
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 微信id
     */
    @Column(name = "wx_id")
    private String wxId;

    /**
     * 微信昵称
     */
    @Column(name = "wx_nickname")
    private String wxNickname;

    /**
     * 角色
     */
    @Column(name = "user_roles")
    private String userRoles;

    /**
     * 头像地址
     */
    @Column(name = "user_avatar_url")
    private String userAvatarUrl;

    /**
     * 创建时间
     */
    @Column(name = "user_create_time")
    private Date userCreateTime;

    /**
     * 修改时间
     */
    @Column(name = "user_update_time")
    private Date userUpdateTime;

    /**
     * 积分
     */
    @Column(name = "user_bonus")
    private Integer userBonus;
}