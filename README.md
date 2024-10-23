# Group Collaboration - Burger Joint
## Group Members: Alexandria, Efrain, Chaela, Dayquon, Collins

### Step 1: Class Assignments (UML Based)
- Item Class (Chaela): Abstract, parent class, to create child classes of objects to be sold.
- Customer Class (Dayquon): Concrete class describing the **Customer** and where they live.
- States Enumeration (Dayquon): State that **Customer** lives in to be able to implement taxes.
- Burger, Fries, Soda Classes (Collins): These are child classes of item.
- ShoppingCart Class (Alexandria): This class will use a list of **Items** to create a cart for the Customer.
- TaxOnOrders Interface (Alexandria): This interface is implemented so that the tax amount can be added to the total depending on which state the customer lives in.
- ShopUtility Class (Efrain): This concrete class houses method that will determine what is done with the Customer's order or ShoppingCart.
- Main/Testing (Ethan): This is where a Cart will be built with Items, Customers will be created with their own Cart, and we will be able to manipulate the Customer's order based on all the classes we have created.

## Step 2: Clone
- First, we must clone our repository.  Open your Git Bash terminal, and make sure you `cd` into the desired directory where you want to store this project.
- Using the link to this repo, you will enter `git clone https://github.com/avpaul527/BurgerJoint_ShoppingCart.git`.
- Note:** Make sure you `cd` into the project when you are ready to push your changes!
- Work on your changes on your cloned repo.

## Step 3: Branches
- When you are ready to push your updated code, go to GitBash.
- As noted above, make sure you are in the right directory! (The directory of your project if not `cd` into it.)
- When first creating a branch, you want to use `git checkout -b (PutYourNameHere)`
  -  [Example: git checkout -b alexandria]
  -  This will create a new branch, name it, AND switch to it at the same time.
-  You can now `git add`, `git commit`, and `git push` to this branch.

## Step 4: Pull Request
- Now we want to merge your changes to the main branch, so we have your contributution as an addition to our full project.
- When you are in git bash, make sure you are `cd` into your project , and your branch in the `()` is set to your branch.
- You can use `git checkout` to switch branches, and `git branch` to check which branch you are on.
- Make sure you have pushed your code.
- Go to the top of the project page, and in the tabs, click **Pull Requests**.
- Press the green button that says **New Pull Request**.
- You can now send a request to merge your branch to the main branch.
- Submit you request and have your caption merge your pull request.  Your changes should now be integrated into the main branch!


**HERE ARE A FEW REFERENCES THAT MAY HELP YOU:**
- GitHub Cheat Sheet: https://education.github.com/git-cheat-sheet-education.pdf
- Some notes about GitHub and commands: https://github.com/avpaul527/PluralSightHW/blob/main/README.md
- Here are some article that Mikaila recommended:
  - https://vickysteeves.gitlab.io/collaborating-with-git/collaborating-with-git.html
  - https://medium.com/@jonathanmines/the-ultimate-github-collaboration-guide-df816e98fb67
  - https://medium.com/@androidmatheny/using-git-and-github-on-group-projects-d636be2cdd4d
 
Please let your captain know if you need anymore clarification!
