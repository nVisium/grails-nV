databaseChangeLog = {

	changeSet(author: "cyrusmalekpour (generated)", id: "1401301791279-1") {
		createTable(tableName: "USER") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_2")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "AUTH_TOKEN", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "CREATED_AT", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "EMAIL", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "FIRSTNAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "LASTNAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "PASSWORD", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "UPDATED_AT", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "VERIFIED", type: "BOOLEAN")
		}
	}

	include file: '2014-05-28-initial-database.groovy'
}
