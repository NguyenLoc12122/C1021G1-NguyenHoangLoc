use chuyen_doi_erd;

create table phieu_xuat(
so_px int auto_increment,
ngay_xuat date,
primary key(so_px)
);

create table vat_tu(
ma_vat_tu int auto_increment,
ten_vat_tu varchar(60),
primary key(ma_vat_tu)
);

create table phieu_nhap(
so_pn int auto_increment,
ngay_nhap date,
primary key(so_pn)
);

create table don_dh(
so_dh int auto_increment,
ngay_dh date,
ma_ncc int not null,
primary key(so_dh),
foreign key(ma_ncc) references nha_cc(ma_ncc)
);

create table nha_cc(
ma_ncc int auto_increment,
ten_ncc varchar(60),
diachi varchar(60),
primary key(ma_ncc)
);
create table phone(
phone_number varchar(20),
ma_ncc int not null,
primary key(phone_number),
foreign key(ma_ncc) references nha_cc(ma_ncc)
);

create table don_dh_chitiet_vat_tu(
so_dh int,
ma_vat_tu int,
primary key(so_dh,ma_vat_tu),
foreign key(so_dh) references don_dh(so_dh),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_xuat_chitiet_vat_tu(
dg_xuat int,
sl_xuat int,
so_px int,
ma_vat_tu int,
primary key (so_px,ma_vat_tu),
foreign key (so_px) references phieu_xuat(so_px),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap_chitiet_vat_tu(
dg_nhap int,
sl_nhap int,
so_pn int,
ma_vat_tu int,
primary key (so_pn,ma_vat_tu),
foreign key (so_pn) references phieu_nhap(so_pn),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);