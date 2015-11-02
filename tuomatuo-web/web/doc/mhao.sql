create table access_log (id int(11) unsigned not null primary key auto_increment, class_name varchar(256) not null, method_name varchar(256) not null, argument varchar(256) not null, process_time bigint(23) default 0, result varchar(256) not null, ip char(11) not null, http_head varchar(256) not null, index(class_name), index(method_name), index(process_time), index(ip));