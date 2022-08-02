/**
 */
package portail_pedagogique;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see portail_pedagogique.Portail_pedagogiqueFactory
 * @model kind="package"
 * @generated
 */
public interface Portail_pedagogiquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "portail_pedagogique";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/portail_pedagogique";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "portail_pedagogique";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Portail_pedagogiquePackage eINSTANCE = portail_pedagogique.impl.Portail_pedagogiquePackageImpl.init();

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.EntityImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.NamedEntityImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.TrainingImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Specialty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__SPECIALTY = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__PRESENTATION = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Education Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__EDUCATION_MANAGER = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secretaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__SECRETARIES = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.SpecialtyImpl <em>Specialty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.SpecialtyImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSpecialty()
	 * @generated
	 */
	int SPECIALTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY__PRESENTATION = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Education Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY__EDUCATION_MANAGER = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secretaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY__SECRETARIES = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY__SEMESTERS = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specialty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Specialty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALTY_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.SubjectImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__LECTURER = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__CREDIT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__PRESENTATION = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__SESSIONS = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.Ressources <em>Ressources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.Ressources
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getRessources()
	 * @generated
	 */
	int RESSOURCES = 8;

	/**
	 * The number of structural features of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ressources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.EmployeeImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL_ADRESS = RESSOURCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__OFFICE = RESSOURCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.GroupImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Numbe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NUMBE = 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.RoomImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BUILDING = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.TemporalResourceImpl <em>Temporal Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.TemporalResourceImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTemporalResource()
	 * @generated
	 */
	int TEMPORAL_RESOURCE = 13;

	/**
	 * The number of structural features of the '<em>Temporal Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RESOURCE_FEATURE_COUNT = RESSOURCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RESOURCE_OPERATION_COUNT = RESSOURCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.TimeIntervalImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__BEGIN_DATE = TEMPORAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__END_DATE = TEMPORAL_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = TEMPORAL_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = TEMPORAL_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.BuildingImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Classroom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CLASSROOM = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.SessionImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 11;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TEACHER = 0;

	/**
	 * The feature id for the '<em><b>Timeinterval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TIMEINTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.DepartmentImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__BUILDING = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEES = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trainings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__TRAININGS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temporalresource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__TEMPORALRESOURCE = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PRESENTATION = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.impl.SemesterImpl
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 14;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail_pedagogique.SessionKind <em>Session Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.SessionKind
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSessionKind()
	 * @generated
	 */
	int SESSION_KIND = 15;

	/**
	 * The meta object id for the '{@link portail_pedagogique.SemesterKind <em>Semester Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail_pedagogique.SemesterKind
	 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSemesterKind()
	 * @generated
	 */
	int SEMESTER_KIND = 16;

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see portail_pedagogique.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail_pedagogique.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see portail_pedagogique.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Training#getSpecialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialty</em>'.
	 * @see portail_pedagogique.Training#getSpecialty()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_Specialty();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Training#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see portail_pedagogique.Training#getPresentation()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Presentation();

	/**
	 * Returns the meta object for the reference list '{@link portail_pedagogique.Training#getEducationManager <em>Education Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Education Manager</em>'.
	 * @see portail_pedagogique.Training#getEducationManager()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_EducationManager();

	/**
	 * Returns the meta object for the reference list '{@link portail_pedagogique.Training#getSecretaries <em>Secretaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secretaries</em>'.
	 * @see portail_pedagogique.Training#getSecretaries()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_Secretaries();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Specialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialty</em>'.
	 * @see portail_pedagogique.Specialty
	 * @generated
	 */
	EClass getSpecialty();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Specialty#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see portail_pedagogique.Specialty#getPresentation()
	 * @see #getSpecialty()
	 * @generated
	 */
	EAttribute getSpecialty_Presentation();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Specialty#getEducationManager <em>Education Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Education Manager</em>'.
	 * @see portail_pedagogique.Specialty#getEducationManager()
	 * @see #getSpecialty()
	 * @generated
	 */
	EReference getSpecialty_EducationManager();

	/**
	 * Returns the meta object for the reference list '{@link portail_pedagogique.Specialty#getSecretaries <em>Secretaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secretaries</em>'.
	 * @see portail_pedagogique.Specialty#getSecretaries()
	 * @see #getSpecialty()
	 * @generated
	 */
	EReference getSpecialty_Secretaries();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Specialty#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see portail_pedagogique.Specialty#getSemesters()
	 * @see #getSpecialty()
	 * @generated
	 */
	EReference getSpecialty_Semesters();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see portail_pedagogique.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see portail_pedagogique.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Subject#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lecturer</em>'.
	 * @see portail_pedagogique.Subject#getLecturer()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Lecturer();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Subject#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see portail_pedagogique.Subject#getCredit()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Credit();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Subject#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see portail_pedagogique.Subject#getPresentation()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Presentation();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Subject#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see portail_pedagogique.Subject#getSessions()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Sessions();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see portail_pedagogique.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Employee#getEmailAdress <em>Email Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Adress</em>'.
	 * @see portail_pedagogique.Employee#getEmailAdress()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmailAdress();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Employee#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see portail_pedagogique.Employee#getOffice()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Office();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see portail_pedagogique.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Group#getNumbe <em>Numbe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbe</em>'.
	 * @see portail_pedagogique.Group#getNumbe()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Numbe();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see portail_pedagogique.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Room#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Building</em>'.
	 * @see portail_pedagogique.Room#getBuilding()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Building();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Ressources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressources</em>'.
	 * @see portail_pedagogique.Ressources
	 * @generated
	 */
	EClass getRessources();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see portail_pedagogique.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.TimeInterval#getBeginDate <em>Begin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Date</em>'.
	 * @see portail_pedagogique.TimeInterval#getBeginDate()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_BeginDate();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.TimeInterval#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see portail_pedagogique.TimeInterval#getEndDate()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_EndDate();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see portail_pedagogique.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Building#getClassroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classroom</em>'.
	 * @see portail_pedagogique.Building#getClassroom()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Classroom();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see portail_pedagogique.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Session#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teacher</em>'.
	 * @see portail_pedagogique.Session#getTeacher()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Teacher();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Session#getTimeinterval <em>Timeinterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timeinterval</em>'.
	 * @see portail_pedagogique.Session#getTimeinterval()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Timeinterval();

	/**
	 * Returns the meta object for the reference '{@link portail_pedagogique.Session#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see portail_pedagogique.Session#getRoom()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Room();

	/**
	 * Returns the meta object for the containment reference '{@link portail_pedagogique.Session#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see portail_pedagogique.Session#getGroup()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Group();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Session#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see portail_pedagogique.Session#getType()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Type();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see portail_pedagogique.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Department#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building</em>'.
	 * @see portail_pedagogique.Department#getBuilding()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Building();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Department#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see portail_pedagogique.Department#getEmployees()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Department#getTrainings <em>Trainings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trainings</em>'.
	 * @see portail_pedagogique.Department#getTrainings()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Trainings();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Department#getTemporalresource <em>Temporalresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporalresource</em>'.
	 * @see portail_pedagogique.Department#getTemporalresource()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Temporalresource();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Department#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see portail_pedagogique.Department#getPresentation()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Presentation();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.TemporalResource <em>Temporal Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Resource</em>'.
	 * @see portail_pedagogique.TemporalResource
	 * @generated
	 */
	EClass getTemporalResource();

	/**
	 * Returns the meta object for class '{@link portail_pedagogique.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see portail_pedagogique.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link portail_pedagogique.Semester#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see portail_pedagogique.Semester#getSubject()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Subject();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Semester#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see portail_pedagogique.Semester#getSemester()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Semester();

	/**
	 * Returns the meta object for the attribute '{@link portail_pedagogique.Semester#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail_pedagogique.Semester#getName()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Name();

	/**
	 * Returns the meta object for enum '{@link portail_pedagogique.SessionKind <em>Session Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Session Kind</em>'.
	 * @see portail_pedagogique.SessionKind
	 * @generated
	 */
	EEnum getSessionKind();

	/**
	 * Returns the meta object for enum '{@link portail_pedagogique.SemesterKind <em>Semester Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Kind</em>'.
	 * @see portail_pedagogique.SemesterKind
	 * @generated
	 */
	EEnum getSemesterKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Portail_pedagogiqueFactory getPortail_pedagogiqueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.NamedEntityImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.TrainingImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Specialty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__SPECIALTY = eINSTANCE.getTraining_Specialty();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__PRESENTATION = eINSTANCE.getTraining_Presentation();

		/**
		 * The meta object literal for the '<em><b>Education Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__EDUCATION_MANAGER = eINSTANCE.getTraining_EducationManager();

		/**
		 * The meta object literal for the '<em><b>Secretaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__SECRETARIES = eINSTANCE.getTraining_Secretaries();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.SpecialtyImpl <em>Specialty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.SpecialtyImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSpecialty()
		 * @generated
		 */
		EClass SPECIALTY = eINSTANCE.getSpecialty();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALTY__PRESENTATION = eINSTANCE.getSpecialty_Presentation();

		/**
		 * The meta object literal for the '<em><b>Education Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALTY__EDUCATION_MANAGER = eINSTANCE.getSpecialty_EducationManager();

		/**
		 * The meta object literal for the '<em><b>Secretaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALTY__SECRETARIES = eINSTANCE.getSpecialty_Secretaries();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALTY__SEMESTERS = eINSTANCE.getSpecialty_Semesters();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.EntityImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.SubjectImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__LECTURER = eINSTANCE.getSubject_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__CREDIT = eINSTANCE.getSubject_Credit();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__PRESENTATION = eINSTANCE.getSubject_Presentation();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__SESSIONS = eINSTANCE.getSubject_Sessions();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.EmployeeImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Email Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMAIL_ADRESS = eINSTANCE.getEmployee_EmailAdress();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__OFFICE = eINSTANCE.getEmployee_Office();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.GroupImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Numbe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NUMBE = eINSTANCE.getGroup_Numbe();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.RoomImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BUILDING = eINSTANCE.getRoom_Building();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.Ressources <em>Ressources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.Ressources
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getRessources()
		 * @generated
		 */
		EClass RESSOURCES = eINSTANCE.getRessources();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.TimeIntervalImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Begin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__BEGIN_DATE = eINSTANCE.getTimeInterval_BeginDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__END_DATE = eINSTANCE.getTimeInterval_EndDate();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.BuildingImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Classroom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__CLASSROOM = eINSTANCE.getBuilding_Classroom();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.SessionImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TEACHER = eINSTANCE.getSession_Teacher();

		/**
		 * The meta object literal for the '<em><b>Timeinterval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TIMEINTERVAL = eINSTANCE.getSession_Timeinterval();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ROOM = eINSTANCE.getSession_Room();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__GROUP = eINSTANCE.getSession_Group();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__TYPE = eINSTANCE.getSession_Type();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.DepartmentImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__BUILDING = eINSTANCE.getDepartment_Building();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEES = eINSTANCE.getDepartment_Employees();

		/**
		 * The meta object literal for the '<em><b>Trainings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__TRAININGS = eINSTANCE.getDepartment_Trainings();

		/**
		 * The meta object literal for the '<em><b>Temporalresource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__TEMPORALRESOURCE = eINSTANCE.getDepartment_Temporalresource();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__PRESENTATION = eINSTANCE.getDepartment_Presentation();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.TemporalResourceImpl <em>Temporal Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.TemporalResourceImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getTemporalResource()
		 * @generated
		 */
		EClass TEMPORAL_RESOURCE = eINSTANCE.getTemporalResource();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.impl.SemesterImpl
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SUBJECT = eINSTANCE.getSemester_Subject();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER = eINSTANCE.getSemester_Semester();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NAME = eINSTANCE.getSemester_Name();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.SessionKind <em>Session Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.SessionKind
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSessionKind()
		 * @generated
		 */
		EEnum SESSION_KIND = eINSTANCE.getSessionKind();

		/**
		 * The meta object literal for the '{@link portail_pedagogique.SemesterKind <em>Semester Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail_pedagogique.SemesterKind
		 * @see portail_pedagogique.impl.Portail_pedagogiquePackageImpl#getSemesterKind()
		 * @generated
		 */
		EEnum SEMESTER_KIND = eINSTANCE.getSemesterKind();

	}

} //Portail_pedagogiquePackage
