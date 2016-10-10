// data storage / data modeling
// ----------------------------
// 1. hard drive ( directory / file / folder )
// 		- pros
// 			- easy access ( already in framework code - java.io, System.IO )
// 			- no networking issues
// 		- cons
//			- hardware issues
//			- data durability
//			- open files and file system locking - multi-user
//			- security ( NTFS / ACL )
// 2. database ( RDBMS - relational database management system )
// 		- pros
//			- relational object indexing / querying
//			- ACID
//				- Atomicity - all or none ( transaction )
//				- Consistency - reliable data / not corrupt
//				- Isolation - isolated transaction ( multi-user )
//				- Durability - survive a catastrophic event ( power loss, hard drive drop etc. )
// 			- Constraints - rules ( primary keys, unique keys, check constraints, data type length )
// 			- Security - uses it's own security rules
// 		- cons
//			- cost ( maintainability / hardware expense )
//			- skilled workers
// 			- networking ( networking speed / complexity / firewall )
//			- implemented a 3rd party library
// 3. directory structure ( LDAP, AD DS - Hierarchical data )
//		- pros
//			- permissions
//			- no expensive join statements or query statement
//			- Durability - multi-master replication
//		- cons
//			- slow to query, see changes
//			- cost ( maintenance / hardware / setup )
//			- skilled workers
//			- networking
// 4. document storage ( mogoDB, documentDB - document database )
//		- pros
//			- ACID compliant
//			- support relational data, hierarchical data, indexing, querying
//			- constraints
//			- security - use's own security or directory security
//			- stored in JSON ( BSON )
//		- cons
//			- networking
//			- skilled workers

// Data Transfer Objects ( DTO )
// -----------------------------
// 1. JSON ( Javascript object notation ), XML ( extensible markup language )

// 2. XML 
//		- Markup tag based language
//		- Very Strict rules
//			- must open and close tags in order




public class DataStorageDataModeling {
	public static void main(String[] args) {

	}
}
