
/* Drop Tables */

DROP TABLE IF EXISTS hora.m_code;
DROP TABLE IF EXISTS hora.t_reservation_detail;
DROP TABLE IF EXISTS hora.m_course;
DROP TABLE IF EXISTS hora.m_course_group;
DROP TABLE IF EXISTS hora.t_shift;
DROP TABLE IF EXISTS hora.m_working_day;
DROP TABLE IF EXISTS hora.m_working_day_detail_deff;
DROP TABLE IF EXISTS hora.m_working_day_deff;
DROP TABLE IF EXISTS hora.m_working_staff;
DROP TABLE IF EXISTS hora.t_reservation;
DROP TABLE IF EXISTS hora.m_shop;
DROP TABLE IF EXISTS hora.m_company;
DROP TABLE IF EXISTS hora.m_staff;
DROP TABLE IF EXISTS hora.m_user;




/* Create Tables */

CREATE TABLE hora.m_code
(
	code_id serial NOT NULL,
	group_code int,
	code1 int,
	code2 int,
	name text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_code_pk PRIMARY KEY (code_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_company
(
	company_id serial NOT NULL,
	company_name text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_company_pk PRIMARY KEY (company_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_course
(
	course_id int NOT NULL,
	course_group_id int,
	course_name text,
	charge int,
	required_time interval,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_course_pk PRIMARY KEY (course_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_course_group
(
	course_group_id serial NOT NULL,
	shop_id int,
	group_name text,
	required_flg smallint,
	reamarks text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_course_group_pk PRIMARY KEY (course_group_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_shop
(
	shop_id serial NOT NULL,
	company_id int,
	shop_abbreviated_name text,
	shop_name text,
	phone1_1 text,
	phone1_2 text,
	phone1_3 text,
	phone2_1 text,
	phone2_2 text,
	phone2_3 text,
	fax_1 text,
	fax_2 text,
	fax_3 text,
	email1 text,
	email2 text,
	url text,
	prefecture smallint,
	city text,
	address1 text,
	address2 text,
	remarks text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_shop_pk PRIMARY KEY (shop_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_staff
(
	staff_id serial NOT NULL,
	family_name text,
	given_name text,
	phone1_1 text,
	phone1_2 text,
	phone1_3 text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_staff_pk PRIMARY KEY (staff_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_user
(
	user_id serial NOT NULL,
	family_name text,
	given_name text,
	family_name_kana text,
	given_name_kana text,
	sex int,
	birthday date,
	phone_first1 text,
	phone_first2 text,
	phone_first3 text,
	phone_second1 text,
	phone_second2 text,
	phone_second3 text,
	email1 text,
	email2 text,
	postal_code char(7),
	prefecture smallint,
	city text,
	address1 text,
	address2 text,
	remarks text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_user_pk PRIMARY KEY (user_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_working_day
(
	working_day_id serial NOT NULL,
	shop_id int,
	working_date date,
	start_time time,
	end_time time,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_working_day_pk PRIMARY KEY (working_day_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_working_day_deff
(
	m_working_day_deff_id serial NOT NULL,
	shop_id int NOT NULL,
	start_day date NOT NULL,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_working_day_deff_pk PRIMARY KEY (m_working_day_deff_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_working_day_detail_deff
(
	working_day_detail_deff_id serial NOT NULL,
	m_working_day_deff_id int NOT NULL,
	effective_flag boolean NOT NULL,
	working_day_flg boolean NOT NULL,
	week_1_flag boolean,
	week_2_flag boolean,
	week_3_flag boolean,
	week4_flag boolean,
	week5_flag boolean,
	mon_flg boolean,
	tue_flg boolean,
	web_flg boolean,
	thu_flg boolean,
	fri_flg boolean,
	sat_flg boolean,
	sun_flg boolean,
	holiday_flg boolean,
	day_of_month smallint,
	specified_day date,
	start_time time,
	end_time time,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_working_day_detail_deff_pk PRIMARY KEY (working_day_detail_deff_id)
) WITHOUT OIDS;


CREATE TABLE hora.m_working_staff
(
	working_staff_id serial NOT NULL,
	shop_id int,
	staff_id int,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_m_working_staff_pk PRIMARY KEY (working_staff_id)
) WITHOUT OIDS;


CREATE TABLE hora.t_reservation
(
	reservation_id bigserial NOT NULL,
	shop_id int,
	staff_id int NOT NULL,
	hist_staff_family_name text,
	hist_shop_name text,
	hist_shop_abbreviated_name text,
	hist_staff_given_name text,
	reservation_date date,
	reservation_time time,
	user_id int,
	total_amount int,
	remarks text,
	status int,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_t_reservation_pk PRIMARY KEY (reservation_id)
) WITHOUT OIDS;


CREATE TABLE hora.t_reservation_detail
(
	reservation_detail_id bigserial NOT NULL,
	reservation_id bigint,
	course_id int,
	hist_course_name text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_t_reservation_detail_pk PRIMARY KEY (reservation_detail_id)
) WITHOUT OIDS;


CREATE TABLE hora.t_shift
(
	shift_id serial NOT NULL,
	working_day_id int,
	staff_id int,
	start_time time,
	end_time time,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	CONSTRAINT idx_t_shift_pk PRIMARY KEY (shift_id)
) WITHOUT OIDS;



