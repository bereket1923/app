package methods;

    class ContactList {


        private String[] contacts = new String[10]; // Array with a capacity of 10
        private int contactCount = 0; // Track the number of contacts added


        // Method to add a contact to the contact list
        public void addContact(String contact) {
            if (contactCount < contacts.length) {
                contacts[contactCount++] = contact; // Add the contact and increment the count
                System.out.println("Added contact: " + contact);
            } else {
                System.out.println("Contact list is full. Cannot add more contacts.");
            }
        }


        // Method to check if a contact is available in the contact list
        private boolean isContactAvailable(String contact) {
            for (int i = 0; i < contactCount; i++) {
                if (contacts[i] != null && contacts[i].equals(contact)) {
                    return true; // Contact is available
                }
            }
            return false; // Contact is not available
        }


        // Method to remove a contact (makes it unavailable in the list)
        public void removeContact(String contact) {
            if (isContactAvailable(contact)) {
                for (int i = 0; i < contactCount; i++) {
                    if (contacts[i].equals(contact)) {
                        System.out.println("Removed contact: " + contact);
                        contacts[i] = null; // Mark the contact as removed
                        break; // Exit the loop after removing the contact
                    }
                }
            } else {
                System.out.println("Contact not found: " + contact);
            }
        }

        // Method to display the available contacts in the contact list
        public void displayContacts() {
            System.out.println("The available contacts are:");
            // Write your code here to display all the available contacts

        }
        // Method to add multiple contacts at once
        public void addContacts(String[] newContacts) {
            // Write your code here to add contacts

        }
    }
    class ContactListMain {
        public static void main(String[] args) {
            ContactList contactList = new ContactList();

            // Adding multiple contacts to the contact list
            String[] newContacts = {
                    "Alice Johnson",
                    "Bob Smith",
                    "Charlie Brown",
                    "Diana Prince"
            };
            contactList.addContacts(newContacts);


            // Removing a specific contact
            String contactToRemove = "Charlie Brown";
            contactList.removeContact(contactToRemove);


            // Displaying the remaining contacts
            contactList.displayContacts();
        }
    }

