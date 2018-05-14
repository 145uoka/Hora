DROP TABLE IF EXISTS hora.m_working_day_detail_deff;
DROP TABLE IF EXISTS hora.m_working_day_deff;
DROP TABLE IF EXISTS hora.m_code;
DROP TABLE IF EXISTS hora.t_shift;
DROP TABLE IF EXISTS hora.m_working_day;
DROP TABLE IF EXISTS hora.m_working_staff;
DROP TABLE IF EXISTS hora.t_reservation_detail;
DROP TABLE IF EXISTS hora.m_course;
DROP TABLE IF EXISTS hora.m_course_group;
DROP TABLE IF EXISTS hora.t_reservation;
DROP TABLE IF EXISTS hora.m_staff;
DROP TABLE IF EXISTS hora.m_user;
DROP TABLE IF EXISTS hora.m_shop;
DROP TABLE IF EXISTS hora.m_company;

/**********************************/
/* テーブル名: 企業マスタ */
/**********************************/
CREATE TABLE hora.m_company(
		company_id SERIAL NOT NULL,
		company_name TEXT
);

/**********************************/
/* テーブル名: 店舗マスタ */
/**********************************/
CREATE TABLE hora.m_shop(
		shop_id SERIAL NOT NULL,
		company_id INTEGER,
		shop_abbreviated_name TEXT,
		shop_name TEXT,
		phone1_1 TEXT,
		phone1_2 TEXT,
		phone1_3 TEXT,
		phone2_1 TEXT,
		phone2_2 TEXT,
		phone2_3 TEXT,
		fax_1 TEXT,
		fax_2 TEXT,
		fax_3 TEXT,
		email1 TEXT,
		email2 TEXT,
		url TEXT,
		prefecture SMALLINT,
		city TEXT,
		address1 TEXT,
		address2 TEXT,
		remarks TEXT
);

/**********************************/
/* テーブル名: ユーザマスタ */
/**********************************/
CREATE TABLE hora.m_user(
		user_id SERIAL NOT NULL,
		family_name TEXT,
		given_name TEXT,
		family_name_kana TEXT,
		given_name_kana TEXT,
		sex INTEGER,
		birthday DATE,
		phone_first1 TEXT,
		phone_first2 TEXT,
		phone_first3 TEXT,
		phone_second1 TEXT,
		phone_second2 TEXT,
		phone_second3 TEXT,
		email1 TEXT,
		email2 TEXT,
		postal_code CHARACTER(7),
		prefecture SMALLINT,
		city TEXT,
		address1 TEXT,
		address2 TEXT,
		remarks TEXT
);

/**********************************/
/* テーブル名: スタッフマスタ */
/**********************************/
CREATE TABLE hora.m_staff(
		staff_id SERIAL NOT NULL,
		family_name TEXT,
		given_name TEXT,
		phone1_1 TEXT,
		phone1_2 TEXT,
		phone1_3 TEXT
);

/**********************************/
/* テーブル名: 予約テーブル */
/**********************************/
CREATE TABLE hora.t_reservation(
		reservation_id BIGSERIAL,
		shop_id INTEGER,
		staff_id SERIAL,
		hist_staff_family_name TEXT,
		hist_shop_name TEXT,
		hist_shop_abbreviated_name TEXT,
		hist_staff_given_name TEXT,
		reservation_date DATE,
		reservation_time TIME,
		user_id INTEGER,
		total_amount INTEGER,
		remarks TEXT,
		status INTEGER
);

/**********************************/
/* テーブル名: コースグループマスタ */
/**********************************/
CREATE TABLE hora.m_course_group(
		course_group_id SERIAL NOT NULL,
		shop_id INTEGER,
		group_name TEXT,
		required_flg SMALLINT,
		reamarks TEXT
);

/**********************************/
/* テーブル名: コースマスタ */
/**********************************/
CREATE TABLE hora.m_course(
		course_id INTEGER NOT NULL,
		course_group_id INTEGER,
		course_name TEXT,
		charge INTEGER,
		required_time INTERVAL
);

/**********************************/
/* テーブル名: 予約明細テーブル */
/**********************************/
CREATE TABLE hora.t_reservation_detail(
		reservation_detail_id BIGSERIAL NOT NULL,
		reservation_id BIGINT,
		course_id INTEGER,
		hist_course_name TEXT
);

/**********************************/
/* テーブル名: 所属スタッフマスタ */
/**********************************/
CREATE TABLE hora.m_working_staff(
		working_staff_id SERIAL NOT NULL,
		shop_id INTEGER,
		staff_id INTEGER
);

/**********************************/
/* テーブル名: 営業日マスタ */
/**********************************/
CREATE TABLE hora.m_working_day(
		working_day_id SERIAL,
		shop_id INTEGER,
		working_date DATE,
		start_time TIME,
		end_time TIME
);

/**********************************/
/* テーブル名: シフトテーブル */
/**********************************/
CREATE TABLE hora.t_shift(
		shift_id SERIAL NOT NULL,
		working_day_id INTEGER,
		staff_id INTEGER,
		start_time TIME,
		end_time TIME
);

/**********************************/
/* テーブル名: コードマスタ */
/**********************************/
CREATE TABLE hora.m_code(
		code_id SERIAL NOT NULL,
		group_code INTEGER,
		code1 INTEGER,
		code2 INTEGER,
		name TEXT
);

/**********************************/
/* テーブル名: 営業日定義マスタ */
/**********************************/
CREATE TABLE hora.m_working_day_deff(
		m_working_day_deff_id SERIAL,
		shop_id SERIAL,
		start_day DATE NOT NULL
);

/**********************************/
/* テーブル名: 営業日詳細定義マスタ */
/**********************************/
CREATE TABLE hora.m_working_day_detail_deff(
		working_day_detail_deff_id SERIAL,
		m_working_day_deff_id SERIAL,
		effective_flag BOOLEAN NOT NULL,
		working_day_flg BOOLEAN NOT NULL,
		week_1_flag BOOLEAN,
		week_2_flag BOOLEAN,
		week_3_flag BOOLEAN,
		week4_flag BOOLEAN,
		week5_flag BOOLEAN,
		mon_flg BOOLEAN,
		tue_flg BOOLEAN,
		web_flg BOOLEAN,
		thu_flg BOOLEAN,
		fri_flg BOOLEAN,
		sat_flg BOOLEAN,
		sun_flg BOOLEAN,
		holiday_flg BOOLEAN,
		day_of_month SMALLINT,
		specified_day DATE,
		start_time TIME,
		end_time TIME
);


ALTER TABLE hora.m_company ADD CONSTRAINT IDX_m_company_PK PRIMARY KEY (company_id);

ALTER TABLE hora.m_shop ADD CONSTRAINT IDX_m_shop_PK PRIMARY KEY (shop_id);
ALTER TABLE hora.m_shop ADD CONSTRAINT IDX_m_shop_FK0 FOREIGN KEY (company_id) REFERENCES hora.m_company (company_id);

ALTER TABLE hora.m_user ADD CONSTRAINT IDX_m_user_PK PRIMARY KEY (user_id);

ALTER TABLE hora.m_staff ADD CONSTRAINT IDX_m_staff_PK PRIMARY KEY (staff_id);

ALTER TABLE hora.t_reservation ADD CONSTRAINT IDX_t_reservation_PK PRIMARY KEY (reservation_id);
ALTER TABLE hora.t_reservation ADD CONSTRAINT IDX_t_reservation_FK0 FOREIGN KEY (user_id) REFERENCES hora.m_user (user_id);
ALTER TABLE hora.t_reservation ADD CONSTRAINT IDX_t_reservation_FK1 FOREIGN KEY (shop_id) REFERENCES hora.m_shop (shop_id);
ALTER TABLE hora.t_reservation ADD CONSTRAINT IDX_t_reservation_FK2 FOREIGN KEY (staff_id) REFERENCES hora.m_staff (staff_id);

ALTER TABLE hora.m_course_group ADD CONSTRAINT IDX_m_course_group_PK PRIMARY KEY (course_group_id);
ALTER TABLE hora.m_course_group ADD CONSTRAINT IDX_m_course_group_FK0 FOREIGN KEY (shop_id) REFERENCES hora.m_shop (shop_id);

ALTER TABLE hora.m_course ADD CONSTRAINT IDX_m_course_PK PRIMARY KEY (course_id);
ALTER TABLE hora.m_course ADD CONSTRAINT IDX_m_course_FK0 FOREIGN KEY (course_group_id) REFERENCES hora.m_course_group (course_group_id);

ALTER TABLE hora.t_reservation_detail ADD CONSTRAINT IDX_t_reservation_detail_PK PRIMARY KEY (reservation_detail_id);
ALTER TABLE hora.t_reservation_detail ADD CONSTRAINT IDX_t_reservation_detail_FK0 FOREIGN KEY (reservation_id) REFERENCES hora.t_reservation (reservation_id);
ALTER TABLE hora.t_reservation_detail ADD CONSTRAINT IDX_t_reservation_detail_FK2 FOREIGN KEY (course_id) REFERENCES hora.m_course (course_id);

ALTER TABLE hora.m_working_staff ADD CONSTRAINT IDX_m_working_staff_PK PRIMARY KEY (working_staff_id);
ALTER TABLE hora.m_working_staff ADD CONSTRAINT IDX_m_working_staff_FK0 FOREIGN KEY (shop_id) REFERENCES hora.m_shop (shop_id);
ALTER TABLE hora.m_working_staff ADD CONSTRAINT IDX_m_working_staff_FK1 FOREIGN KEY (staff_id) REFERENCES hora.m_staff (staff_id);

ALTER TABLE hora.m_working_day ADD CONSTRAINT IDX_m_working_day_PK PRIMARY KEY (working_day_id);
ALTER TABLE hora.m_working_day ADD CONSTRAINT IDX_m_working_day_FK0 FOREIGN KEY (shop_id) REFERENCES hora.m_shop (shop_id);

ALTER TABLE hora.t_shift ADD CONSTRAINT IDX_t_shift_PK PRIMARY KEY (shift_id);
ALTER TABLE hora.t_shift ADD CONSTRAINT IDX_t_shift_FK0 FOREIGN KEY (working_day_id) REFERENCES hora.m_working_day (working_day_id);
ALTER TABLE hora.t_shift ADD CONSTRAINT IDX_t_shift_FK1 FOREIGN KEY (staff_id) REFERENCES hora.m_staff (staff_id);

ALTER TABLE hora.m_code ADD CONSTRAINT IDX_m_code_PK PRIMARY KEY (code_id);

ALTER TABLE hora.m_working_day_deff ADD CONSTRAINT IDX_m_working_day_deff_PK PRIMARY KEY (m_working_day_deff_id);
ALTER TABLE hora.m_working_day_deff ADD CONSTRAINT IDX_m_working_day_deff_FK0 FOREIGN KEY (shop_id) REFERENCES hora.m_shop (shop_id);

ALTER TABLE hora.m_working_day_detail_deff ADD CONSTRAINT IDX_m_working_day_detail_deff_PK PRIMARY KEY (working_day_detail_deff_id);
ALTER TABLE hora.m_working_day_detail_deff ADD CONSTRAINT IDX_m_working_day_detail_deff_FK1 FOREIGN KEY (m_working_day_deff_id) REFERENCES hora.m_working_day_deff (m_working_day_deff_id);

