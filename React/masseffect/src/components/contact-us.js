
// props are dependencies/values that you want to pass to the component when it is created
// You want to use these values in some way when creating the component
// props is intially an empty object that stores values. By convention it is called props
export default function ContactInformation(props){
    const email = props.email;

    // you can interpolate values into your JSX with {}
    return(
        <h5>You can email us for any other Mass Effect information at {email}</h5>
    )
}