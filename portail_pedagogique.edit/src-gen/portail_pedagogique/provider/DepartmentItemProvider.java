/**
 */
package portail_pedagogique.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import portail_pedagogique.Department;
import portail_pedagogique.Portail_pedagogiqueFactory;
import portail_pedagogique.Portail_pedagogiquePackage;

/**
 * This is the item provider adapter for a {@link portail_pedagogique.Department} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DepartmentItemProvider extends NamedEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPresentationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Presentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Department_presentation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Department_presentation_feature",
								"_UI_Department_type"),
						Portail_pedagogiquePackage.Literals.DEPARTMENT__PRESENTATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Portail_pedagogiquePackage.Literals.DEPARTMENT__BUILDING);
			childrenFeatures.add(Portail_pedagogiquePackage.Literals.DEPARTMENT__EMPLOYEES);
			childrenFeatures.add(Portail_pedagogiquePackage.Literals.DEPARTMENT__TRAININGS);
			childrenFeatures.add(Portail_pedagogiquePackage.Literals.DEPARTMENT__TEMPORALRESOURCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Department.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Department"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Department) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Department_type")
				: getString("_UI_Department_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Department.class)) {
		case Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Portail_pedagogiquePackage.Literals.DEPARTMENT__BUILDING,
				Portail_pedagogiqueFactory.eINSTANCE.createBuilding()));

		newChildDescriptors.add(createChildParameter(Portail_pedagogiquePackage.Literals.DEPARTMENT__EMPLOYEES,
				Portail_pedagogiqueFactory.eINSTANCE.createEmployee()));

		newChildDescriptors.add(createChildParameter(Portail_pedagogiquePackage.Literals.DEPARTMENT__TRAININGS,
				Portail_pedagogiqueFactory.eINSTANCE.createTraining()));

		newChildDescriptors.add(createChildParameter(Portail_pedagogiquePackage.Literals.DEPARTMENT__TEMPORALRESOURCE,
				Portail_pedagogiqueFactory.eINSTANCE.createTimeInterval()));
	}

}
