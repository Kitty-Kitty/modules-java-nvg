/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/5/31 22:31:39                           */
/*==============================================================*/


drop table if exists css_center.t_background;

drop table if exists css_center.t_background_play;

drop table if exists css_center.t_background_schedule;

drop table if exists css_center.t_canvas;

drop table if exists css_center.t_controller;

drop table if exists css_center.t_device_type;

drop table if exists css_center.t_division;

drop table if exists css_center.t_font_background;

drop table if exists css_center.t_font_resource;

drop table if exists css_center.t_gateway;

drop table if exists css_center.t_group;

drop table if exists css_center.t_monitor;

drop table if exists css_center.t_re_group_permission;

drop table if exists t_re_group_server;

drop table if exists css_center.t_re_play_permission;

drop table if exists css_center.t_re_resource_permission;

drop table if exists t_re_usrg_permission;

drop table if exists css_center.t_re_vedio_schedule_permission;

drop table if exists css_center.t_resource;

drop table if exists css_center.t_server;

drop table if exists css_center.t_system;

drop table if exists css_center.t_system_exception_log;

drop table if exists css_center.t_system_log;

drop table if exists css_center.t_template;

drop table if exists css_center.t_user;

drop table if exists css_center.t_user_group;

drop table if exists css_center.t_user_log;

drop table if exists css_center.t_version;

drop table if exists css_center.t_video_play;

drop table if exists css_center.t_video_schedule;

/*==============================================================*/
/* Table: t_background                                          */
/*==============================================================*/
create table css_center.t_background
(
   bg_id                varchar(128) not null,
   mnt_id               varchar(128) comment '??????????id',
   gp_id                varchar(128),
   bg_type              varchar(128),
   bg_uri               varchar(128),
   bg_comment           varchar(128),
   primary key (bg_id)
);

alter table css_center.t_background comment '????????';

/*==============================================================*/
/* Table: t_background_play                                     */
/*==============================================================*/
create table css_center.t_background_play
(
   bp_name              varchar(128) comment '????????',
   bp_id                varchar(128) not null comment '??????????id',
   bg_id                varchar(128),
   gp_id                varchar(128),
   bs_id                varchar(128),
   bp_index             int,
   bp_column            int,
   bp_row               int,
   bp_top               int comment '????????Y??',
   bp_left              int comment '????????X??',
   bp_bottom            int comment '????????Y??',
   bp_right             int comment '????????Y??',
   bp_height            int comment '????????',
   bp_width             int comment '????????',
   bp_display           varchar(16) comment '???????????????:enable(??),disable(???)',
   bp_position          varchar(16) comment '?????????????:static(??)?relative(????)',
   bp_overflow          varchar(16),
   bp_layer             int,
   bp_padding_top       int comment '????? top ??????(??)',
   bp_padding_right     int comment '????? right ??????(??)',
   bp_padding_bottom    int comment '????? bottom ??????(??)',
   bp_padding_left      int comment '????? left ??????(??)',
   primary key (bp_id)
);

alter table css_center.t_background_play comment '??????';

/*==============================================================*/
/* Table: t_background_schedule                                 */
/*==============================================================*/
create table css_center.t_background_schedule
(
   bs_id                varchar(128) not null,
   gp_id                varchar(128),
   bs_name              varchar(128) comment '????????',
   bs_index             int,
   bs_mode              varchar(16),
   primary key (bs_id)
);

alter table css_center.t_background_schedule comment '????????';

/*==============================================================*/
/* Table: t_canvas                                              */
/*==============================================================*/
create table css_center.t_canvas
(
   cv_name              varchar(128) comment '????????',
   cv_id                varchar(128) not null comment '??????????id',
   gp_id                varchar(128),
   cv_index             int,
   cv_columns           int,
   cv_rows              int,
   cv_top               int comment '????????Y??',
   cv_left              int comment '????????X??',
   cv_bottom            int comment '????????Y??',
   cv_right             int comment '????????Y??',
   cv_height            int comment '????????',
   cv_width             int comment '????????',
   cv_display           varchar(16) comment '???????????????:enable(??),disable(???)',
   cv_position          varchar(16) comment '?????????????:static(??)?relative(????)',
   cv_overflow          varchar(16),
   cv_layer             int,
   cv_padding_top       int comment '????? top ??????(??)',
   cv_padding_right     int comment '????? right ??????(??)',
   cv_padding_bottom    int comment '????? bottom ??????(??)',
   cv_padding_left      int comment '????? left ??????(??)',
   primary key (cv_id)
);

alter table css_center.t_canvas comment '????';

/*==============================================================*/
/* Table: t_controller                                          */
/*==============================================================*/
create table css_center.t_controller
(
   ct_id                national varchar(128) not null comment '????ID',
   dt_type              int,
   mnt_id               varchar(128) comment '??????????id',
   sys_id               varchar(128),
   css_id               varchar(128),
   ct_name              national varchar(128) comment '????',
   ct_stats             int comment '????',
   ct_ip                national varchar(20) comment '??IP',
   ct_network           national varchar(10) comment '??',
   ct_mac               national varchar(50) comment 'MAC??',
   ct_udp_port          national varchar(5) comment 'udp??',
   ct_tcp_port          national varchar(5) comment 'tcp??',
   ct_registtime        datetime comment '????',
   ct_version           national varchar(128) comment '???',
   ct_limit_play_count  int comment '??????????',
   ct_limit_layer_count int comment '????????????',
   ct_limit_disk        int comment '???????????????????',
   ct_limit_memory      int comment '???????????????????',
   ct_limit_cpu         int comment '????????CPU???????',
   ct_limit_network     int comment '?????????????????',
   primary key (ct_id)
);

alter table css_center.t_controller comment '???';

/*==============================================================*/
/* Table: t_device_type                                         */
/*==============================================================*/
create table css_center.t_device_type
(
   dt_type              int not null,
   dt_name              varchar(128),
   dt_comment           varchar(128),
   primary key (dt_type)
);

/*==============================================================*/
/* Table: t_division                                            */
/*==============================================================*/
create table css_center.t_division
(
   div_name             varchar(128) comment '????????',
   div_id               varchar(128) not null comment '??????????id',
   tp_id                varchar(128) comment '??????????id',
   div_index            int,
   div_column           int,
   div_row              int,
   div_top              int comment '????????Y??',
   div_left             int comment '????????X??',
   div_bottom           int comment '????????Y??',
   div_right            int comment '????????Y??',
   div_height           int comment '????????',
   div_width            int comment '????????',
   div_display          varchar(16) comment '???????????????:enable(??),disable(???)',
   div_position         varchar(16) comment '?????????????:static(??)?relative(????)',
   div_overflow         varchar(16),
   div_layer            int,
   div_padding_top      int comment '????? top ??????(??)',
   div_padding_right    int comment '????? right ??????(??)',
   div_padding_bottom   int comment '????? bottom ??????(??)',
   div_padding_left     int comment '????? left ??????(??)',
   primary key (div_id)
);

alter table css_center.t_division comment '??????';

/*==============================================================*/
/* Table: t_font_background                                     */
/*==============================================================*/
create table css_center.t_font_background
(
   mnt_id               varchar(128) comment '??????????id',
   fb_id                varchar(128) not null,
   fb_type              int,
   fb_uri               varchar(128),
   fb_comment           varchar(128),
   primary key (fb_id)
);

alter table css_center.t_font_background comment '?????????';

/*==============================================================*/
/* Table: t_font_resource                                       */
/*==============================================================*/
create table css_center.t_font_resource
(
   fr_id                varchar(128) not null,
   svr_id               varchar(128),
   fr_name              varchar(128),
   fr_type              int,
   fr_addr              varchar(128),
   primary key (fr_id)
);

alter table css_center.t_font_resource comment '??????';

/*==============================================================*/
/* Table: t_gateway                                             */
/*==============================================================*/
create table css_center.t_gateway
(
   gw_id                varchar(128) not null,
   gw_name              national varchar(128) comment '????',
   gw_stats             int comment '????',
   gw_ip                national varchar(20) comment '??IP',
   gw_network           national varchar(10) comment '??',
   gw_mac               national varchar(50) comment 'MAC??',
   gw_tcp_port          national varchar(5) comment 'tcp??',
   gw_udp_port          national varchar(5) comment 'udp??',
   gw_registtime        datetime comment '????',
   primary key (gw_id)
);

alter table css_center.t_gateway comment '??????';

/*==============================================================*/
/* Table: t_group                                               */
/*==============================================================*/
create table css_center.t_group
(
   gp_id                varchar(128) not null,
   sys_id               varchar(128),
   gp_name              varchar(128),
   gp_index             int,
   gp_columns           int,
   gp_rows              int,
   gp_unit_height       int,
   gp_unit_width        int,
   gp_top               int comment '????????Y??',
   gp_left              int comment '????????X??',
   gp_bottom            int comment '????????Y??',
   gp_right             int comment '????????Y??',
   gp_height            int comment '????????',
   gp_width             int comment '????????',
   gp_display           varchar(16) comment '???????????????:enable(??),disable(???)',
   gp_position          varchar(16) comment '?????????????:static(??)?relative(????)',
   gp_overflow          varchar(16),
   gp_layer             int,
   gp_padding_top       int comment '????? top ??????(??)',
   gp_padding_right     int comment '????? right ??????(??)',
   gp_padding_bottom    int comment '????? bottom ??????(??)',
   gp_padding_left      int comment '????? left ??????(??)',
   primary key (gp_id)
);

alter table css_center.t_group comment '??????';

/*==============================================================*/
/* Table: t_monitor                                             */
/*==============================================================*/
create table css_center.t_monitor
(
   mnt_name             varchar(128) comment '????????',
   mnt_id               varchar(128) not null comment '??????????id',
   gp_id                varchar(128),
   mnt_index            int comment '??????',
   mnt_column           int comment '????',
   mnt_row              int comment '????',
   mnt_top              int comment '????????Y??',
   mnt_left             int comment '????????X??',
   mnt_bottom           int comment '????????Y??',
   mnt_right            int comment '????????Y??',
   mnt_height           int comment '????????',
   mnt_width            int comment '????????',
   mnt_display          varchar(16) comment '???????????????:enable(??),disable(???)',
   mnt_position         varchar(16) comment '?????????????:static(??)?relative(????)',
   mnt_overflow         varchar(16),
   mnt_layer            int,
   mnt_padding_top      int comment '????? top ??????(??)',
   mnt_padding_right    int comment '????? right ??????(??)',
   mnt_padding_bottom   int comment '????? bottom ??????(??)',
   mnt_padding_left     int comment '????? left ??????(??)',
   mnt_backcolor        varchar(16) comment '??????',
   mnt_check_source_color varchar(16) comment '??????????',
   mnt_check_dest_color varchar(16) comment '???????????',
   mnt_backsize_height  int comment '?????????????',
   mnt_backsize_width   int comment '?????????????',
   mnt_luminance        int comment '???????????????',
   mnt_contrast         int comment '????????????????',
   mnt_color_temperature int comment '???????????????',
   mnt_switch           bool comment '???????????????',
   primary key (mnt_id)
);

alter table css_center.t_monitor comment '??????';

/*==============================================================*/
/* Table: t_re_group_permission                                 */
/*==============================================================*/
create table css_center.t_re_group_permission
(
   rgp_id               int not null auto_increment,
   gp_id                varchar(128),
   usrg_id              varchar(128) comment '????ID',
   ugp_get              boolean not null,
   ugp_set              boolean not null,
   ugp_background       varchar(128),
   ugp_font             varchar(128),
   primary key (rgp_id)
);

alter table css_center.t_re_group_permission comment '?????????';

/*==============================================================*/
/* Table: t_re_group_server                                     */
/*==============================================================*/
create table t_re_group_server
(
   rgs_id               int not null auto_increment,
   gp_id                varchar(128),
   svr_id               varchar(128),
   primary key (rgs_id)
);

alter table t_re_group_server comment '??????????';

/*==============================================================*/
/* Table: t_re_play_permission                                  */
/*==============================================================*/
create table css_center.t_re_play_permission
(
   rpp_id               int not null auto_increment,
   vp_id                varchar(128) comment '??????????id',
   usrg_id              varchar(128) comment '????ID',
   usr_id               varchar(128),
   upp_position         varchar(128),
   primary key (rpp_id)
);

alter table css_center.t_re_play_permission comment '??????';

/*==============================================================*/
/* Table: t_re_resource_permission                              */
/*==============================================================*/
create table css_center.t_re_resource_permission
(
   rrp_id               int not null auto_increment,
   usrg_id              varchar(128) comment '????ID',
   usr_id               varchar(128),
   rs_id                varchar(128),
   urp_get              boolean not null,
   urp_set              boolean not null,
   primary key (rrp_id)
);

alter table css_center.t_re_resource_permission comment '????????';

/*==============================================================*/
/* Table: t_re_usrg_permission                                  */
/*==============================================================*/
create table t_re_usrg_permission
(
   rup_id               int not null auto_increment,
   usrg_id              varchar(128),
   usr_id               varchar(128),
   usrg_is_create_group boolean,
   usrg_is_root         boolean,
   usrg_is_create_usrg  boolean,
   usrg_is_delete_usrg  boolean,
   usrg_is_query_usrg   boolean,
   usrg_is_update_usrg  boolean,
   primary key (rup_id)
);

/*==============================================================*/
/* Table: t_re_vedio_schedule_permission                        */
/*==============================================================*/
create table css_center.t_re_vedio_schedule_permission
(
   rvsp_id              int not null auto_increment,
   usrg_id              varchar(128) comment '????ID',
   usr_id               varchar(128),
   vs_id                varchar(128),
   uvsp_set             boolean not null,
   uvsp_get             boolean not null,
   primary key (rvsp_id)
);

alter table css_center.t_re_vedio_schedule_permission comment '????????';

/*==============================================================*/
/* Table: t_resource                                            */
/*==============================================================*/
create table css_center.t_resource
(
   rs_id                varchar(128) not null,
   sys_id               varchar(128),
   svr_id               varchar(128),
   rs_type              int comment '????',
   rs_parent            national varchar(128) comment '????????',
   rs_name              national varchar(128) comment '????',
   rs_showname          national varchar(128) comment '??????',
   rs_ip                national varchar(32) comment '????IP',
   rs_addr              national varchar(1024) comment '??????',
   rs_states            int comment '????',
   rs_fps               int comment '??????',
   rs_bps               int comment '?????',
   primary key (rs_id)
);

alter table css_center.t_resource comment '??????';

/*==============================================================*/
/* Table: t_server                                              */
/*==============================================================*/
create table css_center.t_server
(
   svr_id               varchar(128) not null,
   dt_type              int,
   sys_id               varchar(128),
   css_id               varchar(128),
   svr_name             national varchar(128) comment '????',
   svr_stats            int comment '????',
   svr_ip               national varchar(20) comment '??IP',
   svr_network          national varchar(10) comment '??',
   svr_mac              national varchar(50) comment 'MAC??',
   svr_udp_port         national varchar(5) comment 'udp??',
   svr_tcp_port         national varchar(5) comment 'tcp??',
   svr_registtime       datetime comment '????',
   svr_version          national varchar(128) comment '???',
   svr_limit_disk       int comment '???????????????????',
   svr_limit_memory     int comment '???????????????????',
   svr_limit_cpu        int comment '????????CPU???????',
   svr_limit_network    int comment '?????????????????',
   primary key (svr_id)
);

alter table css_center.t_server comment '?????';

/*==============================================================*/
/* Table: t_system                                              */
/*==============================================================*/
create table css_center.t_system
(
   sys_id               varchar(128) not null,
   dt_type              int,
   gw_id                varchar(128),
   css_id               varchar(128),
   sys_name             national varchar(128) comment '????',
   sys_stats            int comment '????',
   sys_ip               national varchar(20) comment '??IP',
   sys_network          national varchar(10) comment '??',
   sys_mac              national varchar(50) comment 'MAC??',
   sys_udp_port         national varchar(5) comment 'udp??',
   sys_tcp_port         national varchar(5) comment 'tcp??',
   sys_registtime       datetime comment '????',
   sys_version          national varchar(128) comment '???',
   primary key (sys_id)
);

alter table css_center.t_system comment '??????';

/*==============================================================*/
/* Table: t_system_exception_log                                */
/*==============================================================*/
create table css_center.t_system_exception_log
(
   se_index             int not null auto_increment,
   se_time              datetime,
   se_type              int,
   se_level             varchar(16),
   se_comment           varchar(256),
   primary key (se_index)
);

alter table css_center.t_system_exception_log comment '??????????';

/*==============================================================*/
/* Table: t_system_log                                          */
/*==============================================================*/
create table css_center.t_system_log
(
   sl_index             int not null auto_increment,
   sl_time              datetime,
   sl_type              int,
   sl_level             varchar(16),
   sl_comment           varchar(256),
   primary key (sl_index)
);

alter table css_center.t_system_log comment '???????????';

/*==============================================================*/
/* Table: t_template                                            */
/*==============================================================*/
create table css_center.t_template
(
   tp_name              varchar(128) comment '????????',
   tp_id                varchar(128) not null comment '??????????id',
   gp_id                varchar(128),
   tp_index             int,
   tp_columns           int,
   tp_rows              int,
   tp_top               int comment '????????Y??',
   tp_left              int comment '????????X??',
   tp_bottom            int comment '????????Y??',
   tp_right             int comment '????????Y??',
   tp_height            int comment '????????',
   tp_width             int comment '????????',
   tp_display           varchar(16) comment '???????????????:enable(??),disable(???)',
   tp_position          varchar(16) comment '?????????????:static(??)?relative(????)',
   tp_overflow          varchar(16),
   tp_layer             int,
   tp_padding_top       int comment '????? top ??????(??)',
   tp_padding_right     int comment '????? right ??????(??)',
   tp_padding_bottom    int comment '????? bottom ??????(??)',
   tp_padding_left      int comment '????? left ??????(??)',
   primary key (tp_id)
);

alter table css_center.t_template comment '??????';

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table css_center.t_user
(
   usr_id               varchar(128) not null,
   usg_id               varchar(128),
   usr_login            national varchar(128) comment '????',
   usr_password         national varchar(128) comment '????',
   usr_name             national varchar(128) comment '????',
   usr_type             int comment '????',
   master_id            national varchar(128) comment '????',
   usr_emial            national varchar(128) comment '????',
   usr_phone            national varchar(16) comment '????',
   usr_address          national varchar(128) comment '????',
   usr_isvalid          int comment '????',
   usr_create_time      datetime comment '????',
   usr_bz               national varchar(1024) comment '??',
   primary key (usr_id)
);

alter table css_center.t_user comment '????';

/*==============================================================*/
/* Table: t_user_group                                          */
/*==============================================================*/
create table css_center.t_user_group
(
   usg_id               varchar(128) not null,
   usg_name             varchar(128),
   usg_description      varchar(128),
   usg_create_time      datetime,
   primary key (usg_id)
);

alter table css_center.t_user_group comment '?????????';

/*==============================================================*/
/* Table: t_user_log                                            */
/*==============================================================*/
create table css_center.t_user_log
(
   ul_index             int not null auto_increment,
   ul_time              datetime,
   ul_type              int,
   ul_level             varchar(16),
   ul_comment           varchar(256),
   primary key (ul_index)
);

alter table css_center.t_user_log comment '???????????';

/*==============================================================*/
/* Table: t_version                                             */
/*==============================================================*/
create table css_center.t_version
(
   ver_id               int not null auto_increment,
   ver_name             varchar(16),
   ver_serial           int,
   primary key (ver_id)
);

alter table css_center.t_version comment '??????????';

/*==============================================================*/
/* Table: t_video_play                                          */
/*==============================================================*/
create table css_center.t_video_play
(
   vp_name              varchar(128) comment '????????',
   vp_id                varchar(128) not null comment '??????????id',
   gp_id                varchar(128),
   rs_id                varchar(128),
   vs_id                varchar(128),
   vp_index             int,
   vp_channel           int,
   vp_play_session      varchar(128) comment '????session',
   vp_multicast_ip      varchar(32),
   vp_multicast_port    int comment '????????Y??',
   vp_column            int,
   vp_row               int,
   vp_top               int comment '????????Y??',
   vp_left              int comment '????????X??',
   vp_bottom            int comment '????????Y??',
   vp_right             int comment '????????Y??',
   vp_height            int comment '????????',
   vp_width             int comment '????????',
   vp_display           varchar(16) comment '???????????????:enable(??),disable(???)',
   vp_position          varchar(16) comment '?????????????:static(??)?relative(????)',
   vp_overflow          varchar(16),
   vp_layer             int,
   vp_padding_top       int comment '????? top ??????(??)',
   vp_padding_right     int comment '????? right ??????(??)',
   vp_padding_bottom    int comment '????? bottom ??????(??)',
   vp_padding_left      int comment '????? left ??????(??)',
   primary key (vp_id)
);

alter table css_center.t_video_play comment '????????';

/*==============================================================*/
/* Table: t_video_schedule                                      */
/*==============================================================*/
create table css_center.t_video_schedule
(
   vs_id                varchar(128) not null,
   gp_id                varchar(128),
   vs_name              varchar(128) comment '????????',
   vs_index             int,
   vs_mode              varchar(16),
   primary key (vs_id)
);

alter table css_center.t_video_schedule comment '????????';

alter table css_center.t_background add constraint FK_Reference_42 foreign key (mnt_id)
      references css_center.t_monitor (mnt_id) on delete cascade on update cascade;

alter table css_center.t_background add constraint FK_Reference_43 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_background_play add constraint FK_Reference_44 foreign key (bg_id)
      references css_center.t_background (bg_id) on delete cascade on update cascade;

alter table css_center.t_background_play add constraint FK_Reference_45 foreign key (bs_id)
      references css_center.t_background_schedule (bs_id) on delete cascade on update cascade;

alter table css_center.t_background_play add constraint FK_Reference_47 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_background_schedule add constraint FK_Reference_46 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_canvas add constraint FK_Reference_51 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_controller add constraint FK_Reference_36 foreign key (mnt_id)
      references css_center.t_monitor (mnt_id) on delete set null on update cascade;

alter table css_center.t_controller add constraint FK_Reference_59 foreign key (sys_id)
      references css_center.t_system (sys_id) on delete cascade on update cascade;

alter table css_center.t_controller add constraint FK_Reference_Controller_Device_Type_31 foreign key (dt_type)
      references css_center.t_device_type (dt_type);

alter table css_center.t_division add constraint FK_Reference_61_Template_Division foreign key (tp_id)
      references css_center.t_template (tp_id) on delete cascade on update cascade;

alter table css_center.t_font_background add constraint FK_Reference_34 foreign key (mnt_id)
      references css_center.t_monitor (mnt_id) on delete cascade on update cascade;

alter table css_center.t_font_resource add constraint FK_Reference_41 foreign key (svr_id)
      references css_center.t_server (svr_id) on delete cascade on update cascade;

alter table css_center.t_group add constraint FK_Reference_62 foreign key (sys_id)
      references css_center.t_system (sys_id) on delete cascade on update cascade;

alter table css_center.t_monitor add constraint FK_Reference_54 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_re_group_permission add constraint FK_Reference_40 foreign key (usrg_id)
      references css_center.t_user (usr_id) on delete cascade on update cascade;

alter table css_center.t_re_group_permission add constraint FK_Reference_52 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_re_group_permission add constraint FK_Reference_55 foreign key (usrg_id)
      references css_center.t_user_group (usg_id) on delete cascade on update cascade;

alter table t_re_group_server add constraint FK_Reference_48 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table t_re_group_server add constraint FK_Reference_60 foreign key (svr_id)
      references css_center.t_server (svr_id) on delete cascade on update cascade;

alter table css_center.t_re_play_permission add constraint FK_Reference_57 foreign key (usrg_id)
      references css_center.t_user_group (usg_id) on delete cascade on update cascade;

alter table css_center.t_re_play_permission add constraint FK_Reference_64 foreign key (usr_id)
      references css_center.t_user (usr_id) on delete cascade on update cascade;

alter table css_center.t_re_play_permission add constraint FK_Reference_43_Video_Play_User_Play_Permission foreign key (vp_id)
      references css_center.t_video_play (vp_id) on delete cascade on update cascade;

alter table css_center.t_re_resource_permission add constraint FK_Reference_58 foreign key (usrg_id)
      references css_center.t_user_group (usg_id) on delete cascade on update cascade;

alter table css_center.t_re_resource_permission add constraint FK_Reference_68 foreign key (usr_id)
      references css_center.t_user (usr_id) on delete cascade on update cascade;

alter table css_center.t_re_resource_permission add constraint FK_Reference_71 foreign key (rs_id)
      references css_center.t_resource (rs_id) on delete cascade on update cascade;

alter table t_re_usrg_permission add constraint FK_Reference_65 foreign key (usrg_id)
      references css_center.t_user_group (usg_id) on delete cascade on update cascade;

alter table t_re_usrg_permission add constraint FK_Reference_69 foreign key (usr_id)
      references css_center.t_user (usr_id) on delete cascade on update cascade;

alter table css_center.t_re_vedio_schedule_permission add constraint FK_Reference_37 foreign key (usr_id)
      references css_center.t_user (usr_id) on delete cascade on update cascade;

alter table css_center.t_re_vedio_schedule_permission add constraint FK_Reference_56 foreign key (usrg_id)
      references css_center.t_user_group (usg_id) on delete cascade on update cascade;

alter table css_center.t_re_vedio_schedule_permission add constraint FK_Reference_72 foreign key (vs_id)
      references css_center.t_video_schedule (vs_id) on delete cascade on update cascade;

alter table css_center.t_resource add constraint FK_Reference_66 foreign key (svr_id)
      references css_center.t_server (svr_id) on delete cascade on update cascade;

alter table css_center.t_resource add constraint FK_Reference_67 foreign key (sys_id)
      references css_center.t_system (sys_id) on delete cascade on update cascade;

alter table css_center.t_server add constraint FK_Reference_61 foreign key (sys_id)
      references css_center.t_system (sys_id) on delete cascade on update cascade;

alter table css_center.t_server add constraint FK_Reference_Server_Device_Type_34 foreign key (dt_type)
      references css_center.t_device_type (dt_type);

alter table css_center.t_system add constraint FK_Reference_59_System_Device_Type foreign key (dt_type)
      references css_center.t_device_type (dt_type);

alter table css_center.t_system add constraint FK_reference60 foreign key (gw_id)
      references css_center.t_gateway (gw_id) on delete set null on update cascade;

alter table css_center.t_template add constraint FK_Reference_53 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_user add constraint FK_Reference_63 foreign key (usg_id)
      references css_center.t_user_group (usg_id) on delete restrict on update restrict;

alter table css_center.t_video_play add constraint FK_Reference_49 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;

alter table css_center.t_video_play add constraint FK_Reference_70 foreign key (rs_id)
      references css_center.t_resource (rs_id) on delete cascade on update cascade;

alter table css_center.t_video_play add constraint FK_Reference_73 foreign key (vs_id)
      references css_center.t_video_schedule (vs_id) on delete cascade on update cascade;

alter table css_center.t_video_schedule add constraint FK_Reference_50 foreign key (gp_id)
      references css_center.t_group (gp_id) on delete cascade on update cascade;
