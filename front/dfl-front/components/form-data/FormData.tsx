'use client'

export default function FormData() {

    const webUrl: string = "http://localhost:8080"

    const handleSubmit = async(event: any) => {
        event.preventDefault();

        const data = {
            firstName: String(event.target.firstName.value),
            lastName: String(event.target.lastName.value),
            emailAddress: String(event.target.emailAddress.value),
            phoneNumber: String(event.target.phoneNumber.value),
        }

        await fetch(webUrl + "/home/add", {
            method: 'POST',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data),
        }).then((response) => response.json()).then(data => {
            console.log(data);
        })
    }

    return (
        <div className="flex justify-center">
        <form onSubmit={handleSubmit}>
            <h1>Customer Form</h1>
            
        <div>
            <h1>First Name:</h1>
            <input type="text" autoComplete="off" id="firstName" required minLength={3} maxLength={40} />
        </div>

        <div>
            <h1>Last Name:</h1>
            <input type="text" autoComplete="off" id="lastName" required minLength={3} maxLength={40} />
        </div>

        <div>
            <h1>Email Address:</h1>
            <input type="text" autoComplete="off" id="emailAddress" required minLength={3} maxLength={40} />
        </div>

        <div>
            <h1>Phone Number:</h1>
            <input type="text" autoComplete="off" id="phoneNumber" required minLength={10} maxLength={11} />
        </div>

        <button className="bg-green-500/80 p-2 rounded-md" type ="submit">Submit</button>
        </form>

        </div>
    )
}