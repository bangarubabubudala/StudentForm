import React from "react";
import { Formik, Field, Form, ErrorMessage } from "formik";
import * as Yup from "yup";
import {  Form as FormBS } from "react-bootstrap";
import Select from 'react-select';
import {FaUserAlt,FaCalendarAlt,FaUserFriends,FaUsers,FaMobileAlt,FaRoute,FaCity,} from "react-icons/fa";
import { HiIdentification } from "react-icons/hi";
import { FiMail } from "react-icons/fi";
import { BiCurrentLocation, BiLocationPlus } from "react-icons/bi";
import { GrLocation } from "react-icons/gr";
import { GiVillage } from "react-icons/gi";
import './App.css';
import { useState } from "react";
import axios from "axios";





const StudentForm = (props) => {
    const[isLoading,setIsLoading]=useState(false)
    const[submitting,setSubmitting]=useState(false)

    const handleSubmit=(values)=>{
        setIsLoading(true)

        axios.post("http://localhost:8086/application/studentform",values).then(res =>{
            console.log("result",res)

        })
        setIsLoading(false)
    }

    const Gender = [
        { label: "Male", value: "Male" },
        { label: "Female", value: "Female" },
        { label: "Others", value: "Others" }
      ];





  return (
  
    <div className="mt-4">
         
    <div className="container mt-3 ">
        <h3>Student Registration Form</h3>
    
      <Formik
        onSubmit={(values,) => {
            console.log("submitted",values)
            handleSubmit(values);
            setSubmitting(false);
        }}
        initialValues={{
          studentName: "",
          studentFatherName: "",
          dateOfBirth: "",
          studentGender: "",
          studentAadhaarNo: "",
          studentMobileNo: "",
          studentEmailId: "",
          studentState: "",
          studentDistrict: "",
          studentMandal: "",
          studentVillage: "",
          studentStreet: "",
          studentPinCode: "",
        }}
        validationSchema={Yup.object({
          studentName: Yup.string()
          .max(20, "Must be 20 characters or less")
            .min(4, "4 or greater")
            .required("Required"),
          studentFatherName: Yup.string()
            .max(20, "Must be 20 characters")
            .min(4, "4 or greater")
            .required("Required"),
          dateOfBirth: Yup.string()
            .max(12, "12 or less")
            .min(4, "4 of greater")
            .required("Required"),
            studentGender: Yup.string()
            .max(20, "20 or less")
            .min(4, "4 or greater")
            .required("Required"),
          studentAadhaarNo: Yup.string()
            .required("Required")
            .max(12, "must have 12 characters")
            .min(12, "must have 12 characters"),
            
            studentMobileNo: Yup.string()
            .max(10, "Must have 10 characters")
            .min(10, "Must have 10 characters")
            .required("Required"),
            studentEmailId: Yup.string()
            .email("invalid email id")
            .max(50, "Must be 50 characters or less")
            .min(8, "must have 8 or greater")
            .required("Required"),
            studentState: Yup.string()
            .max(30, "Must be 30 characters or less")
            .min(2, "Must have 2 or greater")
            .required("Required"),
            studentDistrict: Yup.string()
            .max(30, "Must be 30 characters or less")
            .min(2, "must have 2 or greater")
            .required("Required"),
            studentMandal: Yup.string()
            .max(30, "Must be 30 characters or less")
            .min(2, "must have 2 or greater")
            .required("Required"),
            studentVillage: Yup.string()
            .max(30, "Must be 30 characters or less")
            .min(2, "must have 2 or greater")
            .required("Required"),
          studentStreet: Yup.string()
            .max(50, "Must be 50 characters or less")
            .min(4, "must have 4 or greater")
            .required("Required"),
            studentPinCode: Yup.string()
            .max(6, "Must be 6 characters or less")
            .min(6, "must be 6 characters")
            .required("Required"),
        })}
        >
        {({ isSubmitting,handleSubmit,setFieldTouched,values,setFieldValue,setworkType,onChangeApplicationType,applicationtypes }) => (
            <Form noValidate onSubmit={handleSubmit}>
            <div >
              <label className="mt-2" htmlFor="studentName">Student Name</label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentName">
                    <FaUserAlt />
                  </span>
                </div>
                <Field className="mb-3"
                  type="text"
                  name="studentName"
                  id="studentName"
                  as={FormBS.Control}
                  />
              </div>
              <div><ErrorMessage name="studentName" component={FormBS.Text} /></div>

              <label htmlFor="studentFatherName">Student Father Name</label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentName">
                    <FaUserFriends />
                  </span>
                </div>
                <Field className="mb-3"
                  type="text"
                  name="studentFatherName"
                  id="studentFatherName"
                  as={FormBS.Control}
                  />
              </div>
              <div><ErrorMessage name="studentFatherName" component={FormBS.Text} /></div>

              <label htmlFor="dateOfBirth">Date of Birth</label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentName">
                    <FaCalendarAlt />
                  </span>
                </div>
                <Field className="mb-3"
                  type="date"
                  name="dateOfBirth"
                  id="dateOfBirth"
                  as={FormBS.Control}
                />
              </div>
              <div><ErrorMessage name="dateOfBirth" component={FormBS.Text} /></div>



              <label htmlFor="studentGender">Gender</label>
              <div className="input-group input-group-sm  ">
                <div className=" input-group-prepend mb-3">
                  <span className="input-group-text " id="studentGender">
                    <FaUsers />
                  </span>
                </div>


                {/* <Field className="mb-3"
                  type="text"
                  name="studentGender"
                  id="studentGender"
                  as={FormBS.Control}
                  />      */}



                   <Select name="studentGender" className="select mb-3" options={Gender}
                   getOptionValue={option=>option?.value}
                   getOptionLabel={option=>option?.label}
                   onChange={(selectedOption)=>{
                    setFieldValue("studentGender",selectedOption?.label)
                   }} />
{/* 
                <Form.Select
                        name="studentGender"
                        className="form-control"
                        onChange={(e) => {
                        setFieldValue('Type', e.target.value)
                        setworkType(e.target.value)
                        onChangeApplicationType(e)
                        }}
                        value={values?.Type}
                        >
                        <option value="">-- Select --</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="others">Others</option>

                        {applicationtypes?.map((item, i) => (
                        <option
                        key={i}
                        value={item?.id}
                        label={item?.applicationType}
                        />
                        ))}
                    </Form.Select> */}



              </div>
              <div><ErrorMessage name="studentGender" component={FormBS.Text} /></div>





              <label className="m" htmlFor="studentAadhaarNo">Student Aadhaar Number </label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentAadhaarNo">
                    <HiIdentification />
                  </span>
                </div>
                <Field className="mb-3"
                  type="text"
                  name="studentAadhaarNo"
                  id="studentAadhaarNo"
                  as={FormBS.Control}
                  />
              </div>
              <div><ErrorMessage name="studentAadhaarNo" component={FormBS.Text} /></div>

              <label htmlFor="studentMobileNo">Student Mobile Number</label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentMobileNo">
                    <FaMobileAlt />
                  </span>
                </div>
                <Field className="mb-3"
                  type="text"
                  name="studentMobileNo"
                  id="studentMobileNo"
                  as={FormBS.Control}
                  />
              </div>
              <div><ErrorMessage name="studentMobileNo" component={FormBS.Text} /></div>

              <label htmlFor="studentEmailId">Student Mail Id</label>
              <div className="input-group input-group-sm">
                <div className="input-group-prepend">
                  <span className="input-group-text" id="studentEmailId">
                    <FiMail />
                  </span>
                </div>
                <Field className="mb-3"
                  type="email"
                  name="studentEmailId"
                  id="studentEmailId"
                  as={FormBS.Control}
                  />
              </div>
              <div><ErrorMessage name="studentEmailId" component={FormBS.Text} /></div>

              <div className="mt-3"><h4><center>Address</center></h4></div>

              <div className="d-flex flex row">
                <div className="col">
                  <label htmlFor="studentState">State</label>
                  <div className="input-group input-group-sm">
                    <div className="input-group-prepend">
                      <span className="input-group-text" id="studentState">
                        <BiCurrentLocation />
                      </span>
                    </div>
                    <Field className="mb-3"
                      type="text"
                      name="studentState"
                      id="studentState"
                      as={FormBS.Control}
                      />
                  </div>
                  <div><ErrorMessage name="studentState" component={FormBS.Text} /></div>

                <label htmlFor="studentMandal">Mandal</label>
                <div className="input-group input-group-sm">
                  <div className="input-group-prepend">
                    <span className="input-group-text" id="studentMandal">
                      <FaCity />
                    </span>
                  </div>
                  <Field className="mb-3"
                    type="text"
                    name="studentMandal"
                    id="studentMandal"
                    as={FormBS.Control}
                    />
                </div>
                <div><ErrorMessage name="studentMandal" component={FormBS.Text} /></div>


                <label htmlFor="studentStreet">Street</label>
                  <div className="input-group input-group-sm">
                    <div className="input-group-prepend">
                      <span className="input-group-text" id="studentStreet">
                        <FaRoute />
                      </span>
                    </div>
                    <Field className="mb-3"
                      type="text"
                      name="studentStreet"
                      id="studentStreet"
                      as={FormBS.Control}
                      />
                  </div>
                  <div><ErrorMessage name="studentStreet" component={FormBS.Text} /></div>


                </div>

                <div className="col">

                <label htmlFor="studentDistrict">District</label>
                  <div className="input-group input-group-sm">
                    <div className="input-group-prepend">
                      <span className="input-group-text" id="studentDistrict">
                        <BiLocationPlus />
                      </span>
                    </div>
                    <Field className="mb-3"
                      type="text"
                      name="studentDistrict"
                      id="studentDistrict"
                      as={FormBS.Control}
                      />
                  </div>
                  <div><ErrorMessage name="studentDistrict" component={FormBS.Text}/></div>

                  <label htmlFor="studentVillage">Village</label>
                  <div className="input-group input-group-sm">
                    <div className="input-group-prepend">
                      <span className="input-group-text" id="studentVillage">
                        <GiVillage />
                      </span>
                    </div>
                    <Field className="mb-3"
                      type="text"
                      name="studentVillage"
                      id="studentVillage"
                      as={FormBS.Control}
                      />
                  </div>
                  <div><ErrorMessage name="studentVillage" component={FormBS.Text} /></div>

                  
                  <label htmlFor="studentPinCode">Pincode</label>
                  <div className="input-group input-group-sm">
                    <div className="input-group-prepend">
                      <span className="input-group-text" id="studentPinCode">
                        <GrLocation />
                      </span>
                    </div>
                    <Field className="mb-3"
                      type="text"
                      name="studentPinCode"
                      id="studentPinCode"
                      as={FormBS.Control}
                      />
                  </div>
                  <div><ErrorMessage name="studentPinCode" component={FormBS.Text} /></div>
                </div>
              </div>

                <div className="row">
                    <div className="col-sm-12 text-center">
                   
                    <button className="btn btn-success btn-md m-3"  disabled={isSubmitting} type="submit">Submit</button>
                    <button className="btn btn-primary btn-md m-3 "  type="reset">Reset</button>
                    
                    </div>
                </div>
            </div>
          </Form>
        )}
      </Formik>
    </div>
</div>
  );
};

export default StudentForm;
