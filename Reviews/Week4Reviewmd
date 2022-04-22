# SDLC
![SDLC](https://i0.wp.com/melsatar.blog/wp-content/uploads/2012/03/sdlc.png?resize=830%2C374&ssl=1)
- Softare Development lifecycle
  - It is not a well defined technical term
  - You will find a lot of different versions of it

### Ranieri SDLC
1. Requirements Analysis
   1. What does the software have to accomplish?
   2. What is the scope of the application?
   3. What is the timeline?
2. Design
   1. Creating the interfaces
   2. Designing the database
   3. API routes
3. Testing/Implementation
   1. In my mind they are 2 sides of the same coin
   2. Developing the software
4. Deployment
   1. Getting your application up and running for users
5. Maitainence/Monitoring
   1. Is the application working correctly?
   2. Is it working with appropriate uptime?
   3. Can see if there are any problems?
6. Analyze the performance of your application
   1. Start the process the again

### Waterfall
- Process of building a product
- from the early 1900's
  - Not designed for software
  - for manufacturing in general
![Waterfall](https://www.umsl.edu/~hugheyd/is6840/images/Waterfall_model.png)
- All planned out from the beginings
  - Every detail is planned out before your start
- ***DON"T DEVIATE FROM THE PLAN***
- You only go down and forward never back!
- Good for projects that well defined end goals and strict requirements
  - Heart Monitor has very strict deadly conseuences
  - Software for a helicopter
    - You know exactly what you have to build
    - You know exactly the machine it it running on

### Agile
- Philosophy of software development
- your mindset remains agile and adaptable
- ***Change the plan if it is better***
- Has more synergy in a lot of software projects.
- Takes advantage of many software specific traits
  - Quickly prototype things
  - Software resources are very malleable
  - Software constantly changes
    - Programs get updates
    - Security vulnerabilities get exposed
    - New better software emerges
- Agile promtotes an iterative philosophy
  - You build one feature at time
  - Software specific trait
![Agile](https://networkinterview.com/wp-content/uploads/2020/10/AGILE-METHODOLOGY.jpg)

![Iterarive](https://hub.packtpub.com/wp-content/uploads/2018/10/Agile-Methodology.jpg)

## Agile Manifesto
- https://agilemanifesto.org/

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


# IaaS PaaS SaaS
- **Infrastructure as a Service**
  - Commision cloud resources that are essentially just virtual hardware
  - IT infrastructure
  - Examples
    - EC2
      - Just a regular old computer
    - EBS
      - Just a disk drive
- **Platform as a Service**
  - The cloud provider gives you *platform* to deploy/build your application
  - It is *not* a completed product
  - **Elastic Beanstalk**
    - Quickly deploy your applications
  - **S3**
    - Easiliy store objects on the cloud
- **Software as a Service** 
  - You use a completed product over the web
    - Examples
      - gmail
      - slack
      - YouTube
### As a sandwich
  - IaaS
    - Go to the grocery store
    - Buy flour and eggs, and a large uncut meat roast
    - You got home and from scratch make bread and butcher and cook the meat
    - You then have your sandwich
  - PaaS
    - Go to the grocery store
    - Buy your sliced roast beef, sliced baguette
    - You then make your sandwich
  - SaaS
    - Go to subway
    - Order what you want

# S3 Simple Storage Service
- **Object-based** storage
  - Object-based
    - .txt
    - .jpg
    - .mp3
- Primary service for storing files
  - Like dropbox or google drive but specifically for programming.
- **Bucket**
  - Globaly unique storage container
  - You must put an object in a bucket
  - You can have as many buckets as you want
- Permissions
  - ACL Access Control List
    - Fine tuned permissions
    - Set permission per object 
  - Bucket Policy
    - JSON configuration that applies to all objects in the bucket
- Storage Clasess
  - S3
    - For objects that you interact with fairly often
      - once a month would be considered often
  - S3 Glacier
    - For objects that you interact with once a year maybe
      - Popular for archives
      - Log files from 6 years ago
      - legal/medical documents that cannot be deleted
    - Glacier is cheaper
- What you pay for in S3
  - The amount of storage you are using
  - The data transfer from reading and uploading
  - S3 can be really cheap unless you have massive data
# EC2
- Elastic Compute Cloud
- Virtual Machines (VMs) that you can provision from Amazon
- They come in a ton of different configurations
- **AMI**
  - Amazon Machine Image
  - OS and intial software you create a VM with
- **EBS**
  - Elastic Block Store
  - Diskdrive associated with the VM
# Elastic Beanstalk
- Platform as a Service
- AWS service for quickly deploying standard applications
  - *standard* a simple http applications
  - No weird setups or configurations that have to be made
- Pros
  - Very fast to deploy an application
    - Literally drag and drop your application
  - Very easy to manage and operate an app on elastic beanstalk
    - Easily configure scaling your application
    - What type of EC2 to run on
    - Gives you automatic monitoring and reporting
      - Health Checks
      - View the requests that come 
      - Monitor your traffic
        - Tons of metrics
- Cons
  - Only supports certain languages
    - Java
    - Python 
    - Ruby
    - more obscure languages or langauges not used for web dev will be tricky
      - C++
      - Julia
      - Rust
  - Do lose customizability
    - You cannot configure every setting on the vm
    - You cannot install custom software or use obscure operating systems
