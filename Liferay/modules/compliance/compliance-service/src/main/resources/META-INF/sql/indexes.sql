create index IX_39F97D79 on Compliance_Compliance (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_80850E3B on Compliance_Compliance (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8495081F on Compliance_Matrix (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6DAF0A61 on Compliance_Matrix (uuid_[$COLUMN_LENGTH:75$], groupId);