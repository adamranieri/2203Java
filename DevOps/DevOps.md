# DevOps

![DevOps](https://software.af.mil/wp-content/uploads/2019/08/devops-loop.svg)
- Portmanteau of **Dev**elopment and **Op**eration**s**
- Relatively new philosphy in software
- The Deployment and operations of an application are handled together
- They *meld* into each other
  - **Developement**
    - Designing the application
    - Writing the code
    - Testing the code to make sure it works correctly
  - **Operations**
    - Building a **deliverable** from your code
    - Deploying deliverables to the cloud (in some way making your application accessible)
    - Monitoring a running applications
- **Deliverable/Artifact**
  - Completed bundle of software
  - Finished product
    - Maybe not polished but in a state that can be used
  - **JAR**
    - Java Archive
    - Glorified zip folder for Java applications
    - Really common Java Deliverable



## CI CD CDD
- **CI Continuous Integration**
  - A process of developing software that emphasizes contiunal small changes to the code base
  - The code is stored in a remote repository
    - Think GitHub
  - Getting code **IN** to a central location
  - **Automated Tests**
    - Tests that run when the code is put into the remote reposity
  - **Static Code Analysis**
    - Robotic peer review
    - A computer tells you all the ways in which your code is bad
      - Not a test
      - It is a critique of your coding style
    - **Sonar Cloud**
- **CD Continuous Delivery**
  - Extension of CI
  - Every time you bring code into the remote repository a *deliverble* is created
  - Usually stored in a staging area
    - Staging area could be an S3 bucket or even just a disk drive
- **CDD Continous Deployment**
  - Extension of CD
  - Every time a deliverable it is automatically deployed for usage
  - Immediately/automaticaly deployed on Elastic Beanstalk
- **Pipeline**
  - The term for all the automated processes involved setting up CI and CD
  - Example Pipeline
    - Code is merged into github
    - GitHub packages and tests the code
    - SonarCloud does a static code analysis
    - The JAR file stored in an S3 bucket
